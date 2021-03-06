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
public class OUT_DNSINFO extends Structure {
	public DNS_IDENTITY_INFO IdentityInfo;
	public DNS_STATUS_INFO StatusInfo;
	public OUT_DNSINFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("IdentityInfo", "StatusInfo");
	}
	public OUT_DNSINFO(DNS_IDENTITY_INFO IdentityInfo, DNS_STATUS_INFO StatusInfo) {
		super();
		this.IdentityInfo = IdentityInfo;
		this.StatusInfo = StatusInfo;
	}
	public OUT_DNSINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_DNSINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_DNSINFO implements Structure.ByValue {
		
	};
}
