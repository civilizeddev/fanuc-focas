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
public class IN_DNSPRMFLAG extends Structure {
	public byte BaudRate;
	public byte DiDataOnAbnormal;
	public byte OwnMacId;
	public byte Di;
	public byte DiSize;
	public byte Do;
	public byte DoSize;
	public byte Status;
	public byte StatusSize;
	public byte[] pad = new byte[7];
	public IN_DNSPRMFLAG() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("BaudRate", "DiDataOnAbnormal", "OwnMacId", "Di", "DiSize", "Do", "DoSize", "Status", "StatusSize", "pad");
	}
	public IN_DNSPRMFLAG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_DNSPRMFLAG implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_DNSPRMFLAG implements Structure.ByValue {
		
	};
}
