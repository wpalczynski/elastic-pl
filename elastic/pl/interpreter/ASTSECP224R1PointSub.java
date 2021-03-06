package elastic.pl.interpreter;

/* Generated By:JJTree: Do not edit this line. ASTSECP224R1PointSub.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSECP224R1PointSub extends AbstractPointSub {
  public ASTSECP224R1PointSub(int id) {
    super(id);
  }

  public ASTSECP224R1PointSub(ElasticPLParser p, int id) {
    super(p, id);
  }

  @Override
  public  String getCurve() { return "secp224r1"; }
  @Override
  public int getCompressedSize() {return 29; }
  @Override
  public int getUncompressedSize()  {return 57; }
  @Override
  public int getPrivkeyInputSize()  {return 28; }

}
/* JavaCC - OriginalChecksum=b1b7b2d1f380ae4ea1e90593f05c2551 (do not edit this line) */
