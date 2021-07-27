package fwlib32;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagODBIFSBLINE extends Structure {
	/** HRV */
	public short hrv_ln;
	/** Axis Num */
	public short ax_num_ln;
	/** Spindel Num */
	public short sp_num_ln;
	/** Pulse Module Num */
	public short pm_num_ln;
	public tagODBIFSBLINE() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("hrv_ln", "ax_num_ln", "sp_num_ln", "pm_num_ln");
	}
	public tagODBIFSBLINE(short hrv_ln, short ax_num_ln, short sp_num_ln, short pm_num_ln) {
		super();
		this.hrv_ln = hrv_ln;
		this.ax_num_ln = ax_num_ln;
		this.sp_num_ln = sp_num_ln;
		this.pm_num_ln = pm_num_ln;
	}
	public tagODBIFSBLINE(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagODBIFSBLINE implements Structure.ByReference {
		
	};
	public static class ByValue extends tagODBIFSBLINE implements Structure.ByValue {
		
	};
}