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
public class iodbslvadr extends Structure {
	public byte slave_no;
	public byte di_size;
	public byte di_type;
	public short di_addr;
	public byte do_size;
	public byte do_type;
	public short do_addr;
	public byte[] reserve = new byte[7];
	public iodbslvadr() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slave_no", "di_size", "di_type", "di_addr", "do_size", "do_type", "do_addr", "reserve");
	}
	public iodbslvadr(byte slave_no, byte di_size, byte di_type, short di_addr, byte do_size, byte do_type, short do_addr, byte reserve[]) {
		super();
		this.slave_no = slave_no;
		this.di_size = di_size;
		this.di_type = di_type;
		this.di_addr = di_addr;
		this.do_size = do_size;
		this.do_type = do_type;
		this.do_addr = do_addr;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
	}
	public iodbslvadr(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbslvadr implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbslvadr implements Structure.ByValue {
		
	};
}
