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
public class IN_EIP_COMMON_PRM_FLG extends Structure {
	public byte TcpPort;
	public byte UdpPort;
	public byte DiDataOnAbnormal;
	public byte Option1;
	public byte[] pad = new byte[4];
	public IN_EIP_COMMON_PRM_FLG() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("TcpPort", "UdpPort", "DiDataOnAbnormal", "Option1", "pad");
	}
	public IN_EIP_COMMON_PRM_FLG(byte TcpPort, byte UdpPort, byte DiDataOnAbnormal, byte Option1, byte pad[]) {
		super();
		this.TcpPort = TcpPort;
		this.UdpPort = UdpPort;
		this.DiDataOnAbnormal = DiDataOnAbnormal;
		this.Option1 = Option1;
		if ((pad.length != this.pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad = pad;
	}
	public IN_EIP_COMMON_PRM_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_EIP_COMMON_PRM_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_EIP_COMMON_PRM_FLG implements Structure.ByValue {
		
	};
}
