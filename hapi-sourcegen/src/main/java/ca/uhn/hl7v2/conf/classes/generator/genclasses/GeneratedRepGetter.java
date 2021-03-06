/**
The contents of this file are subject to the Mozilla Public License Version 1.1 
(the "License"); you may not use this file except in compliance with the License. 
You may obtain a copy of the License at http://www.mozilla.org/MPL/ 
Software distributed under the License is distributed on an "AS IS" basis, 
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
specific language governing rights and limitations under the License. 

The Original Code is "GeneratedRepGetter.java".  Description: 
"This Class represents a method to access a repeatable child" 

The Initial Developer of the Original Code is University Health Network. Copyright (C) 
2001.  All Rights Reserved. 

Contributor(s): James Agnew
                Paul Brohman
                Mitch Delachevrotiere
                Shawn Dyck
  				Cory Metcalf
  				
Alternatively, the contents of this file may be used under the terms of the 
GNU General Public License (the  ?GPL?), in which case the provisions of the GPL are 
applicable instead of those above.  If you wish to allow use of your version of this 
file only under the terms of the GPL and not to allow others to use your version 
of this file under the MPL, indicate your decision by deleting  the provisions above 
and replace  them with the notice and other provisions required by the GPL License.  
If you do not delete the provisions above, a recipient may use your version of 
this file under either the MPL or the GPL. 

*/
package ca.uhn.hl7v2.conf.classes.generator.genclasses;

import ca.uhn.hl7v2.conf.classes.generator.builders.*;

/** This Class represents a method to access a repeatable child
 * @author <table><tr>James Agnew</tr>
 *                 <tr>Paul Brohman</tr>
 *                 <tr>Mitch Delachevrotiere</tr>
 *                 <tr>Shawn Dyck</tr>
 * 				   <tr>Cory Metcalf</tr></table>
 */
public class GeneratedRepGetter extends GeneratedMethod {

   /** A method used to access a reatable child
    * @param profileName this is the profile name associated with this Class
    */
   public GeneratedRepGetter(ProfileName profileName, boolean isRepeatable ) {
      super();

		if ( isRepeatable )
			this.addParam("int rep");
		String repSuperParam = isRepeatable ? "rep" : "1";

		this.setVisibility("public");
		this.setReturnType(profileName.getClassName());
		this.setName(profileName.getAccessorName());
		this.addToThrows("ConfRepException");
		this.addToBody("return (" + profileName.getClassName() + ")super.getChild( " + profileName.getMemberName() + ", " + repSuperParam + " );");
   }

}
