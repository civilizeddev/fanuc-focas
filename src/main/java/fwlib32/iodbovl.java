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
public class iodbovl extends Structure {
	/** dummy */
	public short datano;
	/** axis number */
	public short type;
	/** data value */
	public NativeLong[] data = new NativeLong[((2) * (32))];
	public iodbovl() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("datano", "type", "data");
	}
	public iodbovl(short datano, short type, NativeLong data[]) {
		super();
		this.datano = datano;
		this.type = type;
		if ((data.length != this.data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.data = data;
	}
	public iodbovl(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodbovl implements Structure.ByReference {
		
	};
	public static class ByValue extends iodbovl implements Structure.ByValue {
		
	};
}
