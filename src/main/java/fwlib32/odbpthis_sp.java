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
public class odbpthis_sp extends Structure {
	public double l_value;
	public double l_value_e;
	public double pos_value;
	public double pos_value_e;
	public double l_value_sub;
	public double l_value_e_sub;
	public NativeLong repeat_sub;
	public NativeLong repeat_e_sub;
	public NativeLong srpm;
	public NativeLong rrpm;
	public NativeLong sspm;
	public NativeLong smax;
	public NativeLong info1;
	public short number;
	public short number_sub;
	public short table_kind;
	public byte sp_mode;
	public byte[] name = new byte[4];
	public byte ov_sp;
	public byte reserve1;
	public byte cs_axis_idx_pt;
	public byte cs_axis_idx_rel;
	public byte pos_frac;
	public byte l_frac;
	public byte[] reserve2 = new byte[3];
	public odbpthis_sp() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("l_value", "l_value_e", "pos_value", "pos_value_e", "l_value_sub", "l_value_e_sub", "repeat_sub", "repeat_e_sub", "srpm", "rrpm", "sspm", "smax", "info1", "number", "number_sub", "table_kind", "sp_mode", "name", "ov_sp", "reserve1", "cs_axis_idx_pt", "cs_axis_idx_rel", "pos_frac", "l_frac", "reserve2");
	}
	public odbpthis_sp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbpthis_sp implements Structure.ByReference {
		
	};
	public static class ByValue extends odbpthis_sp implements Structure.ByValue {
		
	};
}