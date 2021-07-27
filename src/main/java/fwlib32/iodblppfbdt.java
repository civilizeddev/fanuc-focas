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
public class iodblppfbdt extends Structure {
	public short ppower;
	public short dummy;
	public short[] freq = new short[10];
	public short[] duty = new short[10];
	public short[] rpower = new short[((10) * (10))];
	public iodblppfbdt() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ppower", "dummy", "freq", "duty", "rpower");
	}
	public iodblppfbdt(short ppower, short dummy, short freq[], short duty[], short rpower[]) {
		super();
		this.ppower = ppower;
		this.dummy = dummy;
		if ((freq.length != this.freq.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.freq = freq;
		if ((duty.length != this.duty.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.duty = duty;
		if ((rpower.length != this.rpower.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rpower = rpower;
	}
	public iodblppfbdt(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends iodblppfbdt implements Structure.ByReference {
		
	};
	public static class ByValue extends iodblppfbdt implements Structure.ByValue {
		
	};
}