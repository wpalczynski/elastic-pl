package elastic.pl.interpreter;
/* Copyright (c) 2006, Sun Microsystems, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Sun Microsystems, Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

/* JJT: 0.2.2 */

public class ASTBitwiseComplNode extends SimpleNode {
  public ASTBitwiseComplNode(int id) {
    super(id);
  }

  public ASTBitwiseComplNode(ElasticPLParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {

     Boolean first_was_boolean = false;

     jjtGetChild(0).interpret();

     if (stack[top] instanceof Boolean)
        first_was_boolean = true;


     Integer int1 = 0;
     if(stack[top] instanceof Integer)
      int1 = ((Integer)stack[top]).intValue();
     else if(stack[top] instanceof Boolean)
      int1 = (((Boolean)stack[top]) == true) ? 1 : 0;
    

     if(first_was_boolean)
       stack[top] = new Boolean(~(int1).intValue()!=0);
     else
       stack[top] = new Integer(~(int1).intValue());

   


     
  }
  public long getConsumedStackUsage(){
      return 1L;
  }
}
