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

import org.exoplatform.component.test.AbstractKernelTest;
import org.exoplatform.component.test.ConfigurationUnit;
import org.exoplatform.component.test.ConfiguredBy;
import org.exoplatform.component.test.ContainerScope;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
@ConfiguredBy(@ConfigurationUnit(scope=ContainerScope.PORTAL, path="conf/iocpractice-configuration.xml"))
public class IOCPracticeTest extends AbstractKernelTest {

  private AClass a;
  private BClass b;
  
  /* (non-Javadoc)
   * @see junit.framework.TestCase#setUp()
   */
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    a = (AClass) getContainer().getComponentInstanceOfType(AClass.class);
    b = a.getB();
  }
  /* (non-Javadoc)
   * @see junit.framework.TestCase#tearDown()
   */
  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }
  
  public void testExternalPlugin() {
    assertEquals(2, a.getNumberOfListener());
    a.newListenerAction();
  }
  
  public void testABDependency() {
    assertNotNull(a.getB());
    assertEquals("TEST", b.test);
  }
  
  public void testInitParams() {
    assertEquals(1, b.getB1());
    assertEquals(2, b.getB2());
  }
  
}
