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
public class odbmdlc extends Structure {
	public short from;
	public short dram;
	public short sram;
	public short pmc;
	public short crtc;
	public short servo12;
	public short servo34;
	public short servo56;
	public short servo78;
	public short sic;
	public short pos_lsi;
	public short hi_aio;
	public short[] reserve = new short[12];
	public short drmmrc;
	public short drmarc;
	public short pmcmrc;
	public short dmaarc;
	public short iopt;
	public short hdiio;
	public short gm2gr1;
	public short crtgr2;
	public short gm1gr2;
	public short gm2gr2;
	public short cmmrb;
	public short sv5axs;
	public short sv7axs;
	public short sicaxs;
	public short posaxs;
	public short hamaxs;
	public short romr64;
	public short srmr64;
	public short dr1r64;
	public short dr2r64;
	public short iopio2;
	public short hdiio2;
	public short cmmrb2;
	public short romfap;
	public short srmfap;
	public short drmfap;
	public short drmare;
	public short pmcmre;
	public short dmaare;
	public short frmbgg;
	public short drmbgg;
	public short asrbgg;
	public short edtpsc;
	public short slcpsc;
	public short[] reserve2 = new short[34];
	public odbmdlc() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("from", "dram", "sram", "pmc", "crtc", "servo12", "servo34", "servo56", "servo78", "sic", "pos_lsi", "hi_aio", "reserve", "drmmrc", "drmarc", "pmcmrc", "dmaarc", "iopt", "hdiio", "gm2gr1", "crtgr2", "gm1gr2", "gm2gr2", "cmmrb", "sv5axs", "sv7axs", "sicaxs", "posaxs", "hamaxs", "romr64", "srmr64", "dr1r64", "dr2r64", "iopio2", "hdiio2", "cmmrb2", "romfap", "srmfap", "drmfap", "drmare", "pmcmre", "dmaare", "frmbgg", "drmbgg", "asrbgg", "edtpsc", "slcpsc", "reserve2");
	}
	public odbmdlc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends odbmdlc implements Structure.ByReference {
		
	};
	public static class ByValue extends odbmdlc implements Structure.ByValue {
		
	};
}
