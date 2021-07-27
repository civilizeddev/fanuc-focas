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
public class ODBP_FTRQ_PRM_INF extends Structure {
	/** sample data save function flag */
	public byte smpl_enbl;
	/** sampling cycle */
	public byte cycle;
	/** number of object axes */
	public byte axis_num;
	/** dummy */
	public byte dummy1;
	public ODBP_FTRQ_PRM_INF() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("smpl_enbl", "cycle", "axis_num", "dummy1");
	}
	public ODBP_FTRQ_PRM_INF(byte smpl_enbl, byte cycle, byte axis_num, byte dummy1) {
		super();
		this.smpl_enbl = smpl_enbl;
		this.cycle = cycle;
		this.axis_num = axis_num;
		this.dummy1 = dummy1;
	}
	public ODBP_FTRQ_PRM_INF(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ODBP_FTRQ_PRM_INF implements Structure.ByReference {
		
	};
	public static class ByValue extends ODBP_FTRQ_PRM_INF implements Structure.ByValue {
		
	};
}