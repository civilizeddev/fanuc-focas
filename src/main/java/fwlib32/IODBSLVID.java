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
public class IODBSLVID extends Structure {
	public short dis_enb;
	public short slave_no;
	public short nsl;
	public byte dgn_size;
	public byte dgn_type;
	public short dgn_addr;
	public IODBSLVID() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("dis_enb", "slave_no", "nsl", "dgn_size", "dgn_type", "dgn_addr");
	}
	public IODBSLVID(short dis_enb, short slave_no, short nsl, byte dgn_size, byte dgn_type, short dgn_addr) {
		super();
		this.dis_enb = dis_enb;
		this.slave_no = slave_no;
		this.nsl = nsl;
		this.dgn_size = dgn_size;
		this.dgn_type = dgn_type;
		this.dgn_addr = dgn_addr;
	}
	public IODBSLVID(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IODBSLVID implements Structure.ByReference {
		
	};
	public static class ByValue extends IODBSLVID implements Structure.ByValue {
		
	};
}