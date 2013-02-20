/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package httl.spi;

import httl.Expression;

import java.text.ParseException;
import java.util.Map;

/**
 * Expression Translator. (SPI, Singleton, ThreadSafe)
 * 
 * @see httl.spi.engines.DefaultEngine#setTranslator(Translator)
 * @see httl.spi.parsers.AbstractParser#setTranslator(Translator)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public interface Translator {

	/**
	 * Translate the template expression to java expression.
	 * 
	 * @param source - expression source
	 * @param parameterTypes - expression parameter types
	 * @param offset - expression offset in template
	 * @return expression instance
	 */
	Expression translate(String source, Map<String, Class<?>> parameterTypes, int offset) throws ParseException;

}