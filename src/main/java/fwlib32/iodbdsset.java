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
public class iodbdsset extends Structure {
	public byte[] host_ip = new byte[16];
	public byte[] host_uname = new byte[32];
	public byte[] host_passwd = new byte[32];
	public byte[] host_dir = new byte[128];
	public byte[] dtsv_mac = new byte[13];
	public byte[] dtsv_ip = new byte[16];
	public byte[] dtsv_mask = new byte[16];
	public iodbdsset() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("host_ip", "host_uname", "host_passwd", "host_dir", "dtsv_mac", "dtsv_ip", "dtsv_mask");
	}
	public iodbdsset(byte host_ip[], byte host_uname[], byte host_passwd[], byte host_dir[], byte dtsv_mac[], byte dtsv_ip[], byte dtsv_mask[]) {
		super();
		if ((host_ip.length != this.host_ip.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.host_ip = host_ip;
		if ((host_uname.length != this.host_uname.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.host_uname = host_uname;
		if ((host_passwd.length != this.host_passwd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.host_passwd = host_passwd;
		if ((host_dir.length != this.host_dir.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.host_dir = host_dir;
		if ((dtsv_mac.length != this.dtsv_mac.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dtsv_mac = dtsv_mac;
		if ((dtsv_ip.length != this.dtsv_ip.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dtsv_ip = dtsv_ip;
		if ((dtsv_mask.length != this.dtsv_mask.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.dtsv_mask = dtsv_mask;
	}
	public iodbdsset(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbdsset implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbdsset implements Structure.ByValue {
		
	};
}
