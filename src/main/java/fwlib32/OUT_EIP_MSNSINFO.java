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
public class OUT_EIP_MSNSINFO extends Structure {
	public byte ModuleStatus;
	public byte NetworkStatus;
	public byte[] pad = new byte[2];
	public OUT_EIP_MSNSINFO() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ModuleStatus", "NetworkStatus", "pad");
	}
	public OUT_EIP_MSNSINFO(byte ModuleStatus, byte NetworkStatus, byte pad[]) {
		super();
		this.ModuleStatus = ModuleStatus;
		this.NetworkStatus = NetworkStatus;
		if ((pad.length != this.pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad = pad;
	}
	public OUT_EIP_MSNSINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_EIP_MSNSINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_EIP_MSNSINFO implements Structure.ByValue {
		
	};
}
