package fwlib32;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OUT_EIP_LISTDETAIL extends Structure {
	public byte[] IpAddress = new byte[40];
	public NativeLong ConnectTime;
	public byte ApplicationType;
	public byte pad1;
	public short O2T_RPI;
	public short T2O_RPI;
	public short O2T_API;
	public short T2O_API;
	public short RecvPacket;
	public short SendPacket;
	public short LostPacket;
	public short AllocationId;
	public byte[] pad2 = new byte[2];
	public OUT_EIP_LISTDETAIL() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("IpAddress", "ConnectTime", "ApplicationType", "pad1", "O2T_RPI", "T2O_RPI", "O2T_API", "T2O_API", "RecvPacket", "SendPacket", "LostPacket", "AllocationId", "pad2");
	}
	public OUT_EIP_LISTDETAIL(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_EIP_LISTDETAIL implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_EIP_LISTDETAIL implements Structure.ByValue {
		
	};
}