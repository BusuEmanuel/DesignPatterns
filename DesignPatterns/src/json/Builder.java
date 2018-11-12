
package json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import visitor.model.Element;
import visitor.model.Image;
import visitor.model.Paragraph;
import visitor.model.Section;

public class Builder implements IBuilder {
  private String fileName;
  private Element document;

  public Builder(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public Element getResult() {
    return document;
  }

  @Override
  public void build() throws JsonParseException, JsonMappingException, IOException {
    ObjectMapper mapper = new ObjectMapper();
    @SuppressWarnings("unchecked")
    HashMap<String, Object> map = mapper.readValue(new File(fileName), HashMap.class);
    //readValue(map);
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      String key = entry.getKey();
      if (key.equals("class")) {
        readValue(map, key);
      }
      Object value = entry.getValue();
      System.out.println(key + " --- " + value);
    }
  }

  public void readValue(HashMap<String, Object> map, String classType) {
    switch (classType) {
      case "Section":
        document.add(buildSection(map));
        break;
      case "Image":
        document.add(buildImage(map));
        break;
      case "Paragraph":
        document.add(buildParagraph(map));
        break;
    }
  }

  @Override
  public Element buildImage(HashMap<String, Object> map) {
    Image image = new Image((String) map.get("url"));
    return image;
  }

  @Override
  public Element buildParagraph(HashMap<String, Object> map) {
    Paragraph paragraph = new Paragraph((String) map.get("text"));
    return paragraph;
  }

  @Override
  public Element buildTable(HashMap<String, Object> map) {
    return null;
  }

  @Override
  public Element buildImageProxy(HashMap<String, Object> map) {
    return null;
  }

  @Override
  public Element buildSection(HashMap<String, Object> map) {
    Section section = new Section((String) map.get("title"));
    readValue(map, (String) map.get("class"));
    return section;
  }
}
