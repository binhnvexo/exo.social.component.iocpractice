/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.social;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
public class AClass {

  private List<SimpleListener> listeners = new ArrayList<SimpleListener>();
  private BClass b;
  
  /**
   * 
   */
  public AClass(BClass b) {
    this.b = b;
  }
  
  public void addListener(SimpleListener listener) {
    listeners.add(listener);
  }
  
  public int getNumberOfListener() {
    return listeners.size();
  }
  
  public void newListenerAction() {
    for (SimpleListener listener : listeners) {
      listener.excute();
    }
  }

  /**
   * @return the b
   */
  public BClass getB() {
    return b;
  }

  /**
   * @param b the b to set
   */
  public void setB(BClass b) {
    this.b = b;
  }

}
