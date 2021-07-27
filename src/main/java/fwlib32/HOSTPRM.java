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
public class HOSTPRM extends Structure {
	public short DataServerPort;
	public byte[] DataServerIPAddress = new byte[16];
	public byte[] DataServerUserName = new byte[32];
	public byte[] DataServerPassword = new byte[32];
	public byte[] DataServerLoginDirectory = new byte[128];
	public HOSTPRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("DataServerPort", "DataServerIPAddress", "DataServerUserName", "DataServerPassword", "DataServerLoginDirectory");
	}
	public HOSTPRM(short DataServerPort, byte DataServerIPAddress[], byte DataServerUserName[], byte DataServerPassword[], byte DataServerLoginDirectory[]) {
		super();
		this.DataServerPort = DataServerPort;
		if ((DataServerIPAddress.length != this.DataServerIPAddress.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DataServerIPAddress = DataServerIPAddress;
		if ((DataServerUserName.length != this.DataServerUserName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DataServerUserName = DataServerUserName;
		if ((DataServerPassword.length != this.DataServerPassword.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DataServerPassword = DataServerPassword;
		if ((DataServerLoginDirectory.length != this.DataServerLoginDirectory.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.DataServerLoginDirectory = DataServerLoginDirectory;
	}
	public HOSTPRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HOSTPRM implements Structure.ByReference {
		
	};
	public static class ByValue extends HOSTPRM implements Structure.ByValue {
		
	};
}