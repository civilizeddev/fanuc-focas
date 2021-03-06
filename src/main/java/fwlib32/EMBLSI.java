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
public class EMBLSI extends Structure {
	public short Collision;
	public short CarrierSenseLost;
	public short DelayOver;
	public short Underrun;
	public short SendParityError;
	public short AlignmentError;
	public short CrcError;
	public short Overrun;
	public short FrameLengthViolation;
	public short RecvParityError;
	public EMBLSI() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Collision", "CarrierSenseLost", "DelayOver", "Underrun", "SendParityError", "AlignmentError", "CrcError", "Overrun", "FrameLengthViolation", "RecvParityError");
	}
	public EMBLSI(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EMBLSI implements Structure.ByReference {
		
	};
	public static class ByValue extends EMBLSI implements Structure.ByValue {
		
	};
}
