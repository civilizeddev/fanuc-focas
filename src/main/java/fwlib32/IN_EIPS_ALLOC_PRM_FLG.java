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
public class IN_EIPS_ALLOC_PRM_FLG extends Structure {
	public byte IpAddress;
	public byte Option1;
	public byte Option2;
	public byte DataUnit;
	public byte Endian;
	public byte ConfigInstance;
	public byte[] pad1 = new byte[2];
	public IN_EIPS_CONN_PRM_FLG ConnT2O;
	public IN_EIPS_CONN_PRM_FLG ConnO2T;
	public byte reserve1;
	public byte reserve2;
	public byte ProductTrigger;
	public byte Timeout;
	public byte Reconnect;
	public byte VendorID;
	public byte DeviceType;
	public byte ProductCode;
	public byte MajorRevision;
	public byte MinorRevision;
	public byte Compatibility;
	public byte pad2;
	public IN_EIPS_ALLOC_PRM_FLG() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("IpAddress", "Option1", "Option2", "DataUnit", "Endian", "ConfigInstance", "pad1", "ConnT2O", "ConnO2T", "reserve1", "reserve2", "ProductTrigger", "Timeout", "Reconnect", "VendorID", "DeviceType", "ProductCode", "MajorRevision", "MinorRevision", "Compatibility", "pad2");
	}
	public IN_EIPS_ALLOC_PRM_FLG(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IN_EIPS_ALLOC_PRM_FLG implements Structure.ByReference {
		
	};
	public static class ByValue extends IN_EIPS_ALLOC_PRM_FLG implements Structure.ByValue {
		
	};
}
