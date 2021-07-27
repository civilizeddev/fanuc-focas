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
public class odbcspid extends Structure {
	/** sp motor spec */
	public byte[] mt_spc = new byte[20];
	/** sp motor s/n */
	public byte[] mt_srn = new byte[10];
	/** subsp motor spec */
	public byte[] sbmt_spc = new byte[20];
	/** subsp motor s/n */
	public byte[] sbmt_srn = new byte[10];
	/** sp amp spec */
	public byte[] spm_spc = new byte[22];
	/** sp amp s/n */
	public byte[] spm_srn = new byte[12];
	/** psm spec */
	public byte[] psm_spc = new byte[22];
	/** psm s/n */
	public byte[] psm_srn = new byte[12];
	public odbcspid() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("mt_spc", "mt_srn", "sbmt_spc", "sbmt_srn", "spm_spc", "spm_srn", "psm_spc", "psm_srn");
	}
	public odbcspid(byte mt_spc[], byte mt_srn[], byte sbmt_spc[], byte sbmt_srn[], byte spm_spc[], byte spm_srn[], byte psm_spc[], byte psm_srn[]) {
		super();
		if ((mt_spc.length != this.mt_spc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.mt_spc = mt_spc;
		if ((mt_srn.length != this.mt_srn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.mt_srn = mt_srn;
		if ((sbmt_spc.length != this.sbmt_spc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.sbmt_spc = sbmt_spc;
		if ((sbmt_srn.length != this.sbmt_srn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.sbmt_srn = sbmt_srn;
		if ((spm_spc.length != this.spm_spc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.spm_spc = spm_spc;
		if ((spm_srn.length != this.spm_srn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.spm_srn = spm_srn;
		if ((psm_spc.length != this.psm_spc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.psm_spc = psm_spc;
		if ((psm_srn.length != this.psm_srn.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.psm_srn = psm_srn;
	}
	public odbcspid(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbcspid implements Structure.ByReference {
		
	};
	public static class ByValue extends odbcspid implements Structure.ByValue {
		
	};
}
