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
public class tagIODBFSSBAXIS extends Structure {
	/** axis number */
	public short axis_num;
	/** reserved */
	public short reserve1;
	/** axis name */
	public byte[] axis_name = new byte[4];
	/** amp name */
	public byte[] amp_name = new byte[8];
	/** M1 */
	public short m1;
	/** M2 */
	public short m2;
	/** M3 */
	public short m3;
	/** M4 */
	public short m4;
	/** 1-DSP */
	public short dsp1;
	/**
	 * short	spos;			/* SPOS * /<br>
	 * Cs
	 */
	public short cs;
	/** tandem */
	public short tndm;
	/**
	 * short	egb;			/* EGB * /<br>
	 * reserved
	 */
	public short reserve2;
	public tagIODBFSSBAXIS() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("axis_num", "reserve1", "axis_name", "amp_name", "m1", "m2", "m3", "m4", "dsp1", "cs", "tndm", "reserve2");
	}
	public tagIODBFSSBAXIS(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagIODBFSSBAXIS implements Structure.ByReference {
		
	};
	public static class ByValue extends tagIODBFSSBAXIS implements Structure.ByValue {
		
	};
}
