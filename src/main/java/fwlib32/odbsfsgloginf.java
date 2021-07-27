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
public class odbsfsgloginf extends Structure {
	public short signal_num;
	public short sig_his_period;
	public short sig_his_count;
	public short sig_his_after;
	public short[] alm_detect_time = new short[3];
	public short dummy;
	public odbsfsgalm sfsg_alm;
	public odbsfsgalmtime sfsg_alm_time;
	public odbsfsgloginf() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("signal_num", "sig_his_period", "sig_his_count", "sig_his_after", "alm_detect_time", "dummy", "sfsg_alm", "sfsg_alm_time");
	}
	public odbsfsgloginf(short signal_num, short sig_his_period, short sig_his_count, short sig_his_after, short alm_detect_time[], short dummy, odbsfsgalm sfsg_alm, odbsfsgalmtime sfsg_alm_time) {
		super();
		this.signal_num = signal_num;
		this.sig_his_period = sig_his_period;
		this.sig_his_count = sig_his_count;
		this.sig_his_after = sig_his_after;
		if ((alm_detect_time.length != this.alm_detect_time.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.alm_detect_time = alm_detect_time;
		this.dummy = dummy;
		this.sfsg_alm = sfsg_alm;
		this.sfsg_alm_time = sfsg_alm_time;
	}
	public odbsfsgloginf(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbsfsgloginf implements Structure.ByReference {
		
	};
	public static class ByValue extends odbsfsgloginf implements Structure.ByValue {
		
	};
}
