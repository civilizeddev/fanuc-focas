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
public class RMTDIAG_PRM extends Structure {
	public byte[] MtbInformation = new byte[17];
	public byte[] MachineInformation = new byte[17];
	public RMTDIAG_CLIENT_PRM[] opposite = new RMTDIAG_CLIENT_PRM[3];
	public RMTDIAG_PRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("MtbInformation", "MachineInformation", "opposite");
	}
	public RMTDIAG_PRM(byte MtbInformation[], byte MachineInformation[], RMTDIAG_CLIENT_PRM opposite[]) {
		super();
		if ((MtbInformation.length != this.MtbInformation.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.MtbInformation = MtbInformation;
		if ((MachineInformation.length != this.MachineInformation.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.MachineInformation = MachineInformation;
		if ((opposite.length != this.opposite.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.opposite = opposite;
	}
	public RMTDIAG_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends RMTDIAG_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends RMTDIAG_PRM implements Structure.ByValue {
		
	};
}