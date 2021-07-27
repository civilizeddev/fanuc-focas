package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class odbshp extends Structure {
	/** object type */
	public short ob_type;
	/** object number */
	public short obj_no;
	/** shape number */
	public short shp_no;
	/** figure element 1?6 */
	public short[] fig_ele = new short[10];
	/** reference position */
	public NativeLong[] ref_pos = new NativeLong[3];
	/** tool reference position */
	public NativeLong[] tool_ref = new NativeLong[3];
	/** tool direction */
	public NativeLong[] tool_dir = new NativeLong[3];
	/** reference angle1 */
	public NativeLong ref_ang1;
	/** reference angle2 */
	public NativeLong ref_ang2;
	/** numetrical unit */
	public byte n_unit;
	public odbshp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ob_type", "obj_no", "shp_no", "fig_ele", "ref_pos", "tool_ref", "tool_dir", "ref_ang1", "ref_ang2", "n_unit");
	}
	public odbshp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbshp implements Structure.ByReference {
		
	};
	public static class ByValue extends odbshp implements Structure.ByValue {
		
	};
}