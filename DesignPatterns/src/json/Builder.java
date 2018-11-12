
package json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import visitor.model.Element;

public class Builder implements IBuilder {
  private String fileName;
  private Element document;

  public Builder(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public Element getResult() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void build() throws JsonParseException, JsonMappingException, IOException {
    ObjectMapper mapper = new ObjectMapper();
    HashMap<String, Object> mapValue = mapper.readValue(new File(fileName), HashMap.class);
    if (mapValue.get("class").equals("Section")) {
      document.add();
    }
  }

  @Override
  public Element buildImage(HashMap<String, Object> map) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Element buildParagraph(HashMap<String, Object> map) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Element buildTable(HashMap<String, Object> map) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Element buildImageProxy(HashMap<String, Object> map) {
    // TODO Auto-generated method stub
    return null;
  }
}
