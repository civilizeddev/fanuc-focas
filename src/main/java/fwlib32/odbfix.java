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
public class odbfix extends Structure {
	public short mode;
	public short[] pln_axes = new short[2];
	public short drl_axes;
	public NativeLong i_pos;
	public NativeLong r_pos;
	public NativeLong z_pos;
	public NativeLong cmd_cnt;
	public NativeLong act_cnt;
	public NativeLong cut;
	public NativeLong[] shift = new NativeLong[2];
	public odbfix() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mode", "pln_axes", "drl_axes", "i_pos", "r_pos", "z_pos", "cmd_cnt", "act_cnt", "cut", "shift");
	}
	public odbfix(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbfix implements Structure.ByReference {
		
	};
	public static class ByValue extends odbfix implements Structure.ByValue {
		
	};
}