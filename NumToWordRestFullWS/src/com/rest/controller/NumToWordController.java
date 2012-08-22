/**
 * 
 */
package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Suhani
 *
 */
@Controller
@RequestMapping("/convertService")
public class NumToWordController {
 
	@RequestMapping(value="/{number}", method = RequestMethod.GET)
	@ResponseBody
	public String  getWord(@PathVariable("number") int num) {
		
		return NumToWordHelper.convertNumberToWords(num);
		
	}
	
 
}