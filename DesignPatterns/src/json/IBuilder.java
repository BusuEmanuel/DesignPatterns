
package json;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import visitor.model.Element;

public interface IBuilder {

  Element getResult();

  void build() throws JsonParseException, JsonMappingException, IOException;

  Element buildImage(HashMap<String, Object> map);

  Element buildParagraph(HashMap<String, Object> map);

  Element buildTable(HashMap<String, Object> map);

  Element buildImageProxy(HashMap<String, Object> map);

}
