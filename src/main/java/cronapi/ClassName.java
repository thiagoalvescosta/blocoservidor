package cronapi;

import cronapi.CronapiMetaData;
import cronapi.ParamMetaData;


/**
 * Function Description ...
 *
 * @author Thiago Costa
 * @version 1.0
 * @since 2021-03-04
 *
 */

@CronapiMetaData(categoryName = "Category")
public class ClassName {

	@CronapiMetaData(type = "function", name = "Function Name", description = "Function Description")
	public static String ReducedFunctionName(@ParamMetaData(description = "Parameter") String input) throws Exception {
		return "Input " + input;
	}

}