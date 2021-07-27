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
public class OUT_DNMNODEINFO extends Structure {
	public short MacId;
	public short State;
	public short RetryCounter;
	public short VenderId;
	public short DeviceType;
	public short ProductCode;
	public OUT_DNMNODEINFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("MacId", "State", "RetryCounter", "VenderId", "DeviceType", "ProductCode");
	}
	public OUT_DNMNODEINFO(short MacId, short State, short RetryCounter, short VenderId, short DeviceType, short ProductCode) {
		super();
		this.MacId = MacId;
		this.State = State;
		this.RetryCounter = RetryCounter;
		this.VenderId = VenderId;
		this.DeviceType = DeviceType;
		this.ProductCode = ProductCode;
	}
	public OUT_DNMNODEINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNMNODEINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNMNODEINFO implements Structure.ByValue {
		
	};
}