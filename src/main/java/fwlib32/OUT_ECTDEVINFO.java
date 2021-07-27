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
public class OUT_ECTDEVINFO extends Structure {
	public byte[] EsiVersion = new byte[8];
	public NativeLong VendorID;
	public NativeLong ProductCode;
	public NativeLong RevisionNo;
	public short NodeAddress;
	public byte[] pad = new byte[2];
	public OUT_ECTDEVINFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("EsiVersion", "VendorID", "ProductCode", "RevisionNo", "NodeAddress", "pad");
	}
	public OUT_ECTDEVINFO(byte EsiVersion[], NativeLong VendorID, NativeLong ProductCode, NativeLong RevisionNo, short NodeAddress, byte pad[]) {
		super();
		if ((EsiVersion.length != this.EsiVersion.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.EsiVersion = EsiVersion;
		this.VendorID = VendorID;
		this.ProductCode = ProductCode;
		this.RevisionNo = RevisionNo;
		this.NodeAddress = NodeAddress;
		if ((pad.length != this.pad.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pad = pad;
	}
	public OUT_ECTDEVINFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OUT_ECTDEVINFO implements Structure.ByReference {
		
	};
	public static class ByValue extends OUT_ECTDEVINFO implements Structure.ByValue {
		
	};
}
