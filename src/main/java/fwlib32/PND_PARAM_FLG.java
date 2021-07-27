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
public class PND_PARAM_FLG extends Structure {
	public byte OwnIpAddress;
	public byte SubNetmask;
	public byte RouterIpAddress;
	public byte DnsServer1IpAddress;
	public byte DnsServer2IpAddress;
	public byte OwnHostName;
	public byte OwnDomain;
	public byte PingIpAddress;
	public byte PingCount;
	public byte PnDeviceMode;
	public byte DiDataOnAbnormal;
	public byte BasicOption1;
	public byte BasicOption2;
	public byte AllocOption1;
	public byte AllocOption2;
	public byte DiData;
	public byte DoData;
	public byte Status;
	public byte DeviceName;
	public byte pad2;
	public PND_PARAM_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("OwnIpAddress", "SubNetmask", "RouterIpAddress", "DnsServer1IpAddress", "DnsServer2IpAddress", "OwnHostName", "OwnDomain", "PingIpAddress", "PingCount", "PnDeviceMode", "DiDataOnAbnormal", "BasicOption1", "BasicOption2", "AllocOption1", "AllocOption2", "DiData", "DoData", "Status", "DeviceName", "pad2");
	}
	public PND_PARAM_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PND_PARAM_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends PND_PARAM_FLG implements Structure.ByValue {
		
	};
}