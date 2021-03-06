/**
 * Copyright (C) 2010 dennis zhuang (killme2008@gmail.com)
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this program;
 * if not, write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 **/
package com.googlecode.aviator.lexer.token;

import java.util.Map;


/**
 * Variable token
 *
 * @author dennis
 *
 */
public class Variable extends AbstractToken<Object> {

  public boolean isQuote() {
    return this.quote;
  }


  public void setQuote(final boolean special) {
    this.quote = special;
  }

  private boolean quote = false;

  /**
   * Boolean value true
   */
  public static final Variable TRUE = new Variable("true", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return true;
    }

  };

  /**
   * Boolean value false
   */
  public static final Variable FALSE = new Variable("false", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return false;
    }

  };

  /**
   * Boolean value false
   */
  public static final Variable NIL = new Variable("nil", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return null;
    }

  };


  /**
   * Lambda keyword
   */
  public static final Variable LAMBDA = new Variable("lambda", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * end keyword
   */
  public static final Variable END = new Variable("end", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * if keyword
   */
  public static final Variable IF = new Variable("if", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * else keyword
   */
  public static final Variable ELSE = new Variable("else", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };


  /**
   * for keyword
   */
  public static final Variable FOR = new Variable("for", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * in keyword
   */
  public static final Variable IN = new Variable("in", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * return keyword
   */
  public static final Variable RETURN = new Variable("return", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * return keyword
   */
  public static final Variable BREAK = new Variable("break", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * return keyword
   */
  public static final Variable CONTINUE = new Variable("continue", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * let keyword
   */
  public static final Variable LET = new Variable("let", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * while keyword
   */
  public static final Variable WHILE = new Variable("while", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * fn keyword
   */
  public static final Variable FN = new Variable("fn", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  /**
   * elsif keyword
   */
  public static final Variable ELSIF = new Variable("elsif", -1) {

    @Override
    public Object getValue(final Map<String, Object> env) {
      return this;
    }

  };

  @Override
  public com.googlecode.aviator.lexer.token.Token.TokenType getType() {
    return TokenType.Variable;
  }


  @Override
  public Object getValue(final Map<String, Object> env) {
    if (env != null) {
      return env.get(this.lexeme);
    } else {
      return this.lexeme;
    }
  }


  public Variable(final String name, final int startIndex) {
    super(startIndex, name);
  }


  @Override
  public String toString() {
    String index = ",index=" + getStartIndex();
    if (getStartIndex() == -1) {
      index = "";
    }
    return "[type='variable',lexeme='" + getLexeme() + "'" + index + "]";
  }

}
