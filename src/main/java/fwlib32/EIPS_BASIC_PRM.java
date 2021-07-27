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
public class EIPS_BASIC_PRM extends Structure {
	public EIP_COMMON_PRM Common;
	public short Network;
	public byte[] pad = new byte[2];
	public byte Option2;
	public byte AllocMax;
	public short ConnectMax;
	public short RPI_Min;
	public short RPI_Max;
	public EIP_PMC_ADDR StatusAddr;
	public NativeLong StatusSize;
	public EIPS_BASIC_PRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("Common", "Network", "pad", "Option2", "AllocMax", "ConnectMax", "RPI_Min", "RPI_Max", "StatusAddr", "StatusSize");
	}
	public EIPS_BASIC_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EIPS_BASIC_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends EIPS_BASIC_PRM implements Structure.ByValue {
		
	};
}