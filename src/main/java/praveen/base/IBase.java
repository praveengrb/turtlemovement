/*******************************************************
* Written by Praveen,Sankarasubramanian
* Unauthorized copying of this file, via any medium is strictly prohibited
* Proprietary and confidential
* 
*******************************************************/
package praveen.base;

import org.apache.log4j.Logger;


/**
 * Base Interface has the basic properties
 * 
 * @since 1.0
 * @author Praveen,Sankarasubramanian
 * @version 1.0
 */
public interface IBase {
	/**
	 * @return
	 */
	default Logger log(){
		return Logger.getLogger(getClass());
	}
}
