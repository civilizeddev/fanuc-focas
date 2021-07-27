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
public class BOARDLSI extends Structure {
	public short SendRetryOver;
	public short Collision;
	public short CarrierSenseLost;
	public short NoCarrier;
	public short InvalidFrameLength;
	public short CrcError;
	public short ShortFrame;
	public short LongFrame;
	public short OddFrame;
	public short Overflow;
	public short PhyLsiError;
	public BOARDLSI() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("SendRetryOver", "Collision", "CarrierSenseLost", "NoCarrier", "InvalidFrameLength", "CrcError", "ShortFrame", "LongFrame", "OddFrame", "Overflow", "PhyLsiError");
	}
	public BOARDLSI(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends BOARDLSI implements Structure.ByReference {
		
	};
	public static class ByValue extends BOARDLSI implements Structure.ByValue {
		
	};
}
