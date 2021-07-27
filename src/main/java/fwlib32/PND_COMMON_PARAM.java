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
public class PND_COMMON_PARAM extends Structure {
	public byte[] OwnMacAddress = new byte[16];
	public byte[] OwnIpAddress = new byte[40];
	public byte[] SubNetmask = new byte[16];
	public byte[] RouterIpAddress = new byte[40];
	public byte[] DnsServer1IpAddress = new byte[40];
	public byte[] DnsServer2IpAddress = new byte[40];
	public byte[] OwnHostName = new byte[32];
	public byte[] OwnDomain = new byte[64];
	public PND_COMMON_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("OwnMacAddress", "OwnIpAddress", "SubNetmask", "RouterIpAddress", "DnsServer1IpAddress", "DnsServer2IpAddress", "OwnHostName", "OwnDomain");
	}
	public PND_COMMON_PARAM(byte OwnMacAddress[], byte OwnIpAddress[], byte SubNetmask[], byte RouterIpAddress[], byte DnsServer1IpAddress[], byte DnsServer2IpAddress[], byte OwnHostName[], byte OwnDomain[]) {
		super();
		if ((OwnMacAddress.length != this.OwnMacAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OwnMacAddress = OwnMacAddress;
		if ((OwnIpAddress.length != this.OwnIpAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OwnIpAddress = OwnIpAddress;
		if ((SubNetmask.length != this.SubNetmask.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.SubNetmask = SubNetmask;
		if ((RouterIpAddress.length != this.RouterIpAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.RouterIpAddress = RouterIpAddress;
		if ((DnsServer1IpAddress.length != this.DnsServer1IpAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DnsServer1IpAddress = DnsServer1IpAddress;
		if ((DnsServer2IpAddress.length != this.DnsServer2IpAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DnsServer2IpAddress = DnsServer2IpAddress;
		if ((OwnHostName.length != this.OwnHostName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OwnHostName = OwnHostName;
		if ((OwnDomain.length != this.OwnDomain.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.OwnDomain = OwnDomain;
	}
	public PND_COMMON_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PND_COMMON_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PND_COMMON_PARAM implements Structure.ByValue {
		
	};
}
