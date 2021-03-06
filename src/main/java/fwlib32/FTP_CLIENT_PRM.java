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
public class FTP_CLIENT_PRM extends Structure {
	public byte[] HostName = new byte[64];
	public NativeLong ControlPort;
	public NativeLong Dummy;
	public byte[] UserName = new byte[32];
	public byte[] Password = new byte[32];
	public byte[] LoginDirectory = new byte[128];
	public FTP_CLIENT_PRM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("HostName", "ControlPort", "Dummy", "UserName", "Password", "LoginDirectory");
	}
	public FTP_CLIENT_PRM(byte HostName[], NativeLong ControlPort, NativeLong Dummy, byte UserName[], byte Password[], byte LoginDirectory[]) {
		super();
		if ((HostName.length != this.HostName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.HostName = HostName;
		this.ControlPort = ControlPort;
		this.Dummy = Dummy;
		if ((UserName.length != this.UserName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.UserName = UserName;
		if ((Password.length != this.Password.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.Password = Password;
		if ((LoginDirectory.length != this.LoginDirectory.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.LoginDirectory = LoginDirectory;
	}
	public FTP_CLIENT_PRM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FTP_CLIENT_PRM implements Structure.ByReference {
		
	};
	public static class ByValue extends FTP_CLIENT_PRM implements Structure.ByValue {
		
	};
}
