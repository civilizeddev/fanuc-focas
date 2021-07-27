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
public class iodblegpr extends Structure {
	public short slct;
	public short power;
	public short freq;
	public short duty;
	public short[] reserve = new short[5];
	public iodblegpr() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("slct", "power", "freq", "duty", "reserve");
	}
	public iodblegpr(short slct, short power, short freq, short duty, short reserve[]) {
		super();
		this.slct = slct;
		this.power = power;
		this.freq = freq;
		this.duty = duty;
		if ((reserve.length != this.reserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserve = reserve;
	}
	public iodblegpr(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodblegpr implements Structure.ByReference {
		
	};
	public static class ByValue extends iodblegpr implements Structure.ByValue {
		
	};
}
