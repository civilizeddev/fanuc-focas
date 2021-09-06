package fwlib32

import com.sun.jna.Native
import com.sun.jna.NativeLibrary
import com.sun.jna.NativeLong
import com.sun.jna.Pointer
import com.sun.jna.ptr.NativeLongByReference
import com.sun.jna.win32.StdCallLibrary

import java.nio.ByteBuffer
import java.nio.DoubleBuffer
import java.nio.ShortBuffer

object Fwlib32 {
  val JNA_LIBRARY_NAME              = "Fwlib32"
  val JNA_NATIVE_LIB: NativeLibrary = NativeLibrary.getInstance(Fwlib32.JNA_LIBRARY_NAME)
  val INSTANCE: Fwlib32 = {
    val lib = Native.load(Fwlib32.JNA_LIBRARY_NAME, classOf[Fwlib32])
    require(Fwlibe1.INSTANCE != null)
    lib
  }
  val MAX_AXIS: Int                 = 32
  val MAX_SPINDLE: Int              = 8
  val MAX_AXISNAME: Int             = 4
  val ALL_AXES: Int                 = -1
  val ALL_SPINDLES: Int             = -1
  val MAX_LOCK_PROG: Int            = 12
  val EW_PROTOCOL: Short            = -17
  val EW_SOCKET: Short              = -16
  val EW_NODLL: Short               = -15
  val EW_INIERR: Short              = -14
  val EW_ITLOW: Short               = -13
  val EW_ITHIGHT: Short             = -12
  val EW_BUS: Short                 = -11
  val EW_SYSTEM2: Short             = -10
  val EW_HSSB: Short                = -9
  val EW_HANDLE: Short              = -8
  val EW_VERSION: Short             = -7
  val EW_UNEXP: Short               = -6
  val EW_SYSTEM: Short              = -5
  val EW_PARITY: Short              = -4
  val EW_MMCSYS: Short              = -3
  val EW_RESET: Short               = -2
  val EW_BUSY: Short                = -1
  val EW_OK: Short                  = 0
  val EW_FUNC: Short                = 1
  val EW_NOPMC: Short               = 1
  val EW_LENGTH: Short              = 2
  val EW_NUMBER: Short              = 3
  val EW_RANGE: Short               = 3
  val EW_ATTRIB: Short              = 4
  val EW_TYPE: Short                = 4
  val EW_DATA: Short                = 5
  val EW_NOOPT: Short               = 6
  val EW_PROT: Short                = 7
  val EW_OVRFLOW: Short             = 8
  val EW_PARAM: Short               = 9
  val EW_BUFFER: Short              = 10
  val EW_PATH: Short                = 11
  val EW_MODE: Short                = 12
  val EW_REJECT: Short              = 13
  val EW_DTSRVR: Short              = 14
  val EW_ALARM: Short               = 15
  val EW_STOP: Short                = 16
  val EW_PASSWD: Short              = 17
  val EW_PMC: Short                 = 18
  val EW_PMCHANDLE: Short           = 19
  val EW_RD_OVWSTP: Short           = 20
  val EW_RD_RSTFIN: Short           = 21
  val DNC_NORMAL: Int               = -1
  val DNC_CANCEL: Int               = -32768
  val DNC_OPENERR: Int              = -514
  val DNC_NOFILE: Int               = -516
  val DNC_READERR: Int              = -517
  val LIB_MODE: Int                 = 0
  val MOVE_RDPRGPTR: Int            = 1
  val PRM_ALLPATH: Int              = 2
  val UPLOAD_M02M99: Int            = 3
  val MSG_NOCTRL: Int               = 4
  val DIAM_RAD_SWITCH: Int          = 5
  val MSG_CONV: Int                 = 6
  val ASYNC_READ_PROG3: Int         = 7
  val UP_DNLOAD_EDT: Int            = 8
  val PROG_WORD_SRCH: Int           = 9
  val ONUM_ZERO_SUP: Int            = 10
  val LONG_ISE_FIG: Int             = 11
  val INT_CHK_UNIT: Int             = 12
  val HZR_PRM_WR_SKIP: Int          = 13
  val SLVSRAM_ACCESS: Int           = 14
  val GET_SMTCP_STAT: Int           = 15
  val TLIFE_OPTION: Int             = 16
  val SVGD_MATE_PUNCH: Int          = 17
  val READ_FLD_ON: Int              = 18
  val DELETE_RECURSIVE: Int         = 19
  val READ_ORIG_OPT: Int            = 20
  val SVGD_MATE_ORIGIN: Int         = 21
  val PUN_SFZN_MDP: Int             = 22
  val PAXIS_PATH: Int               = 23
  val AXDATA_G198: Int              = 24
  val BG_EDIT_SIGNAL: Int           = 25
  val UPLOAD_BG: Int                = 26
  val TDATA_EXTRACT: Int            = 27
  val PROG_CHECK_CMNT: Int          = 28
  val INITIAL_AX_CONFIG: Int        = 29
  val MGI_SPECIFICATION: Int        = 30
  val EFFECTIVE_COND: Int           = 31
  val LEVEL8_PROTECT: Int           = 32
  val ACTPT_M198: Int               = 33
  val SYSINFO_AXIS: Int             = 34
  val ALARM_INFO_TYPE: Int          = 35
  val PROG_LEDT_SPUP: Int           = 36
  val OPMSG_STATUS: Int             = 37
  val ASYNC_SEARCHWORD: Int         = 38
  val MA_OPT: Int                   = 39
  val ENABLE_FOCAS_DMA: Int         = 40
  val DSHOST_RD_SRCH: Int           = 41
  val BG_EDIT_CONTINUE: Int         = 42
  val BG_EDIT_GRAPH: Int            = 43
  val SEARCHWORD_PNTR: Int          = 44
  val PROG_UPLD_PROT: Int           = 45
  val PGLOCK_TYPE: Int              = 64
  val TLIFE_TOOL0: Int              = 128
  val OPPROG_DSP: Int               = 256
  val OPPROG_MODE: Int              = 512
  val PROGRAM_CHECK: Int            = 1024
  val CZPP_NEDPP: Int               = 2048
  val MULTI_PATH_MIX_AXIS_NAME: Int = 4096
  val WSETER_GRP: Int               = 8
  val WSETER_DATA: Int              = 8
  val MAX_POS_BUF: Int              = 2
  val TLGS_EMP: Int                 = 0x7fffffff
  val DC_PRM: Int                   = 1
  val DC_OFS: Int                   = 2
  val DC_WKZ: Int                   = 3
  val DC_MAC: Int                   = 4
  val DC_PCD: Int                   = 5
  val DC_RTM: Int                   = 6
  val MAX_PITCH_GROUP: Int          = 8
}
trait Fwlib32 extends StdCallLibrary {
  def cnc_machine3(short1: Short, short2: Short, short3: Short, short4: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_machine3_ex(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAXIS_EXPtr1: odbaxis_ex.ByReference
  ): Short
  def cnc_actf(short1: Short, ODBACTPtr1: odbact.ByReference): Short
  def cnc_absolute(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_machine(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_machine2(short1: Short, short2: Short, short3: Short, short4: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_relative(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_distance(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_distancem(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_skip(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_srvdelay(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_accdecdly(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_rddynamic(short1: Short, short2: Short, short3: Short, ODBDYPtr1: odbdy.ByReference): Short
  def cnc_rddynamic2(short1: Short, short2: Short, short3: Short, ODBDY2Ptr1: odbdy2.ByReference): Short
  def cnc_rddynamic3(short1: Short, short2: Short, short3: Short, ODBDY3Ptr1: odbdy3.ByReference): Short
  def cnc_rddynamic3m(short1: Short, short2: Short, short3: Short, ODBDY3MPtr1: odbdy3m.ByReference): Short
  def cnc_acts(short1: Short, ODBACTPtr1: odbact.ByReference): Short
  def cnc_acts2(short1: Short, short2: Short, ODBACT2Ptr1: odbact2.ByReference): Short
  def cnc_wrrelpos(short1: Short, short2: Short, IDBWRRPtr1: idbwrr.ByReference): Short
  def cnc_prstwkcd(short1: Short, short2: Short, IDBWRAPtr1: idbwra.ByReference): Short
  def cnc_rdmovrlap(short1: Short, short2: Short, short3: Short, IODBOVLPtr1: iodbovl.ByReference): Short
  def cnc_rdmovrlapm(short1: Short, short2: Short, short3: Short, IODBOVLMPtr1: iodbovlm.ByReference): Short
  def cnc_canmovrlap(short1: Short, short2: Short): Short
  def cnc_rdspload(short1: Short, short2: Short, ODBSPNPtr1: odbspn.ByReference): Short
  def cnc_rdspmaxrpm(short1: Short, short2: Short, ODBSPNPtr1: odbspn.ByReference): Short
  def cnc_rdspgear(short1: Short, short2: Short, ODBSPNPtr1: odbspn.ByReference): Short
  def cnc_absolute2(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_relative2(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_distance2(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_setvrtclpos(short1: Short, short2: Short): Short
  def cnc_setthrdngpos(short1: Short): Short
  def cnc_rdposition(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBPOSPtr1: odbpos.ByReference): Short
  def cnc_rdspeed(short1: Short, short2: Short, ODBSPEEDPtr1: odbspeed.ByReference): Short
  def cnc_rdsvmeter(short1: Short, shortPtr1: ShortBuffer, ODBSVLOADPtr1: odbsvload.ByReference): Short
  def cnc_rdspmeter(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBSPLOADPtr1: odbspload.ByReference): Short
  def cnc_rdhndintrpt(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBHNDPtr1: odbhnd.ByReference): Short
  def cnc_rd5axmandt(short1: Short, ODB5AXMANPtr1: odb5axman.ByReference): Short
  def cnc_rd5axovrlap(short1: Short, short2: Short, short3: Short, ODBAXISPtr1: odbaxis.ByReference): Short
  def cnc_clr5axpls(short1: Short, short2: Short): Short
  def cnc_rdspcss(short1: Short, ODBCSSPtr1: odbcss.ByReference): Short
  def cnc_rdexecpt(short1: Short, PRGPNTPtr1: prgpnt.ByReference, PRGPNTPtr2: prgpnt.ByReference): Short
  def cnc_rdexecptm(short1: Short, PRGPNTPtr1: prgpnt.ByReference, PRGPNTPtr2: prgpnt.ByReference): Short
  def cnc_rdexecprgnum(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdjogdrun(short1: Short, short2: Short, ODBJOGDRUNPtr1: odbjogdrun.ByReference): Short
  def cnc_setfrp(short1: Short, short2: Short): Short
  def cnc_rdaxisdata(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      short3: Short,
      shortPtr2: ShortBuffer,
      ODBAXDTPtr1: odbaxdt.ByReference
  ): Short
  def cnc_simulation(short1: Short, short2: Short, short3: Short, ODBSIMLPtr1: odbsiml.ByReference): Short
  def cnc_rdspdlspeed(short1: Short, short2: Short, short3: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdposfig(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBPOSFIGPtr1: odbposfig.ByReference
  ): Short
  def cnc_rdactspdl(short1: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_dwnstart(short1: Short): Short
  def cnc_download(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_cdownload(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_dwnend(short1: Short): Short
  def cnc_dwnend2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dwnstart3(short1: Short, short2: Short): Short
  def cnc_dwnstart3_f(short1: Short, short2: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_download3(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_dwnend3(short1: Short): Short
  def cnc_dwnstart3m(short1: Short, short2: Short, long1: NativeLong): Short
  def cnc_download3m(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_dwnend3m(short1: Short, short2: Short): Short
  def cnc_dwnstart4(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_download4(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_dwnend4(short1: Short): Short
  def cnc_vrfstart(short1: Short): Short
  def cnc_verify(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_cverify(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_vrfend(short1: Short): Short
  def cnc_vrfstart4(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_verify4(short1: Short, length: NativeLongByReference, data: ByteBuffer): Short
  def cnc_vrfend4(short1: Short): Short
  def cnc_dncstart(short1: Short): Short
  def cnc_dnc(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_cdnc(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_dncend(short1: Short): Short
  def cnc_dncstart2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dnc2(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_dncend2(short1: Short, short2: Short): Short
  def cnc_rddncdgndt(short1: Short, ODBDNCDGNPtr1: odbdncdgn.ByReference): Short
  def cnc_rddncdgndt2(short1: Short, ODBDNCDGN2Ptr1: odbdncdgn2.ByReference): Short
  def cnc_upstart(short1: Short, short2: Short): Short
  def cnc_upload(short1: Short, ODBUPPtr1: odbup.ByReference, shortPtr1: ShortBuffer): Short
  def cnc_cupload(short1: Short, ODBUPPtr1: odbup.ByReference, shortPtr1: ShortBuffer): Short
  def cnc_upend(short1: Short): Short
  def cnc_upstart3(short1: Short, short2: Short, long1: NativeLong, long2: NativeLong): Short
  def cnc_upstart3_f(short1: Short, short2: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_upload3(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_upend3(short1: Short): Short
  def cnc_upstart4(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_upload4(short1: Short, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_upend4(short1: Short): Short
  def cnc_save_maint(short1: Short): Short
  def cnc_clear_maint(short1: Short): Short
  def cnc_buff(short1: Short, ODBBUFPtr1: odbbuf.ByReference): Short
  def cnc_search(short1: Short, short2: Short): Short
  def cnc_search2(short1: Short, long1: NativeLong): Short
  def cnc_delall(short1: Short): Short
  def cnc_pdf_delall(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_delete(short1: Short, short2: Short): Short
  def cnc_delrange(short1: Short, long1: NativeLong, long2: NativeLong): Short
  def cnc_rdprogdir(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      PRGDIRPtr1: prgdir.ByReference
  ): Short
  def cnc_rdproginfo(short1: Short, short2: Short, short3: Short, ODBNCPtr1: odbnc.ByReference): Short
  def cnc_rdprgnum(short1: Short, ODBPROPtr1: odbpro.ByReference): Short
  def cnc_exeprgname(short1: Short, ODBEXEPRGPtr1: odbexeprg.ByReference): Short
  def cnc_exeprgname2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_exeprgname_bg(short1: Short, ODBEXEPRGPtr1: odbexeprg.ByReference): Short
  def cnc_dncprgname(short1: Short, ODBDNCPRGPtr1: odbdncprg.ByReference): Short
  def cnc_rdseqnum(short1: Short, ODBSEQPtr1: odbseq.ByReference): Short
  def cnc_seqsrch(short1: Short, long1: NativeLong): Short
  def cnc_seqsrch2(short1: Short, long1: NativeLong): Short
  def cnc_rewind(short1: Short): Short
  def cnc_rdblkcount(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdexecprog(short1: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_rdexecprog2(
      short1: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      charPtr1: ByteBuffer
  ): Short
  def cnc_rdexecprog3(short1: Short, shortPtr1: ShortBuffer, ODBEXEPRGINFOPtr1: odbexeprginfo.ByReference): Short
  def cnc_rdmdiprog(short1: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_wrmdiprog(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_rdmdipntr(short1: Short, ODBMDIPPtr1: odbmdip.ByReference): Short
  def cnc_wrmdipntr(short1: Short, long1: NativeLong): Short
  def cnc_newprog(short1: Short, long1: NativeLong): Short
  def cnc_copyprog(short1: Short, long1: NativeLong, long2: NativeLong): Short
  def cnc_renameprog(short1: Short, long1: NativeLong, long2: NativeLong): Short
  def cnc_condense(short1: Short, short2: Short, long1: NativeLong): Short
  def cnc_mergeprog(short1: Short, short2: Short, long1: NativeLong, long2: NativeLong, long3: NativeLong): Short
  def cnc_rdactpt(short1: Short, longPtr1: NativeLongByReference, longPtr2: NativeLongByReference): Short
  def cnc_pdf_rdactpt(short1: Short, charPtr1: ByteBuffer, longPtr1: NativeLongByReference): Short
  def cnc_pdf_rdprgname(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_rdactpt_bgedt(short1: Short, charPtr1: ByteBuffer, longPtr1: NativeLongByReference): Short
  def cnc_pdf_rdmainpt(short1: Short, charPtr1: ByteBuffer, longPtr1: NativeLongByReference): Short
  def cnc_pdf_rdcallstack(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      ODBNESTPDFPtr1: odbnest.ByReference
  ): Short
  def cnc_setactptopt(short1: Short, long1: NativeLong): Short
  def cnc_rduvactpt(
      short1: Short,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference,
      longPtr3: NativeLongByReference
  ): Short
  def cnc_wractpt(short1: Short, long1: NativeLong, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_pdf_wractpt(short1: Short, charPtr1: ByteBuffer, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_pdf_wractpt_bgedt(short1: Short, charPtr1: ByteBuffer, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdprogline(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      charPtr1: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdprogline2(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      charPtr1: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdprogdata(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      charPtr1: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_wrprogline(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      charPtr1: ByteBuffer,
      long3: NativeLong
  ): Short
  def cnc_delprogline(short1: Short, long1: NativeLong, long2: NativeLong, long3: NativeLong): Short
  def cnc_searchword(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      short2: Short,
      short3: Short,
      long3: NativeLong,
      charPtr1: ByteBuffer
  ): Short
  def cnc_searchword2(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      short2: Short,
      short3: Short,
      long3: NativeLong,
      charPtr1: ByteBuffer
  ): Short
  def cnc_pdf_searchword(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      long4: NativeLong,
      charPtr2: ByteBuffer
  ): Short
  def cnc_pdf_searchword_bgedt(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      long4: NativeLong,
      charPtr2: ByteBuffer
  ): Short
  def cnc_pdf_dssearch(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      long4: NativeLong,
      charPtr2: ByteBuffer,
      short2: Short
  ): Short
  def cnc_searchresult(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_searchresult2(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_pdf_searchresult(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_pdf_searchresult_bgedt(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_pdf_replaceword_all(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      charPtr2: ByteBuffer,
      charPtr3: ByteBuffer
  ): Short
  def cnc_setpglock(short1: Short, long1: NativeLong): Short
  def cnc_setpdf_pglock(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_resetpglock(short1: Short, long1: NativeLong): Short
  def cnc_resetpdf_pglock(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdpglockstat(short1: Short, longPtr1: NativeLongByReference, longPtr2: NativeLongByReference): Short
  def cnc_rdpdf_pglockstat(
      short1: Short,
      longPtr1: NativeLongByReference,
      ODBPRGNAMEPtr1: odbprgname.ByReference
  ): Short
  def cnc_setsumdt(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_rdpdf_line(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      charPtr2: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdpdf_line_bgedt(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      charPtr2: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdpdf_execline(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      charPtr2: ByteBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_wrpdf_line(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      charPtr2: ByteBuffer,
      long2: NativeLong
  ): Short
  def cnc_pdf_delline(short1: Short, charPtr1: ByteBuffer, long1: NativeLong, long2: NativeLong): Short
  def cnc_wrpdf_char(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      charPtr2: ByteBuffer,
      long3: NativeLong
  ): Short
  def cnc_pdf_delchar(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong
  ): Short
  def cnc_pdf_replacechar(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      charPtr2: ByteBuffer,
      long4: NativeLong
  ): Short
  def cnc_rdpdf_drive(short1: Short, ODBPDFDRVPtr1: odbpdfdrv.ByReference): Short
  def cnc_rdpdf_inf(short1: Short, charPtr1: ByteBuffer, short2: Short, ODBPDFINFPtr1: odbpdfinf.ByReference): Short
  def cnc_rdpdf_curdir(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_wrpdf_curdir(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_rdpdf_subdir(
      short1: Short,
      shortPtr1: ShortBuffer,
      IDBPDFSDIRPtr1: idbpdfsdir.ByReference,
      ODBPDFSDIRPtr1: odbpdfsdir.ByReference
  ): Short
  def cnc_rdpdf_alldir(
      short1: Short,
      shortPtr1: ShortBuffer,
      IDBPDFADIRPtr1: idbpdfadir.ByReference,
      ODBPDFADIRPtr1: odbpdfadir.ByReference
  ): Short
  def cnc_rdpdf_prginf(short1: Short, IDBPDFPRGPtr1: idbpdfprg.ByReference, ODBPDFPRGPtr1: odbpdfprg.ByReference): Short
  def cnc_rdprotect(FlibHndl: Short, `type`: Short, path: ByteBuffer, prtct: odbprtct): Short
  def cnc_rdprotect2(FlibHndl: Short, `type`: Short, path: ByteBuffer, prtct: odbprtct2): Short
  def cnc_rdpdf_subdirn(short1: Short, charPtr1: ByteBuffer, ODBPDFNFILPtr1: odbpdfnfil.ByReference): Short
  def cnc_pdf_add(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_add_bgedt(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_del(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_rename(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_rdmain(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_slctmain(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_cond(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_wrpdf_attr(short1: Short, charPtr1: ByteBuffer, IDBPDFTDIRPtr1: idbpdftdir.ByReference): Short
  def cnc_pdf_copy(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_move(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_cpmv_start(short1: Short, short2: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer, short3: Short): Short
  def cnc_pdf_cpmv_poll(short1: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_pdf_cpmv_end(short1: Short): Short
  def cnc_pdf_cpmv_restart(short1: Short, short2: Short): Short
  def cnc_file_cpmv_start(
      short1: Short,
      short2: Short,
      charPtr1: ByteBuffer,
      charPtr2: ByteBuffer,
      short3: Short
  ): Short
  def cnc_file_cpmv_poll(short1: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_file_cpmv_end(short1: Short): Short
  def cnc_file_cpmv_restart(short1: Short, short2: Short): Short
  def cnc_punch_prog(short1: Short, long1: NativeLong): Short
  def cnc_punch_prog2(short1: Short, long1: NativeLong, charPtr1: ByteBuffer): Short
  def cnc_punch_prog3(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_punch_prog_bg(short1: Short, long1: NativeLong): Short
  def cnc_punch_prog2_bg(short1: Short, long1: NativeLong, charPtr1: ByteBuffer): Short
  def cnc_punch_prog3_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_start_async_punch_prog3(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_punch_prog3(short1: Short, charPtr1: ByteBuffer, shortPtr1: ShortBuffer): Short
  def cnc_start_async_punch_prog3_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_punch_prog3_bg(short1: Short, charPtr1: ByteBuffer, shortPtr1: ShortBuffer): Short
  def cnc_pdf_punch(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_punch_bg(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_start_async_pdf_punch(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_pdf_punch(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_read_prog(short1: Short, long1: NativeLong): Short
  def cnc_read_prog2(short1: Short, long1: NativeLong, charPtr1: ByteBuffer): Short
  def cnc_read_prog3(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_read_prog_bg(short1: Short, long1: NativeLong, charPtr1: ByteBuffer): Short
  def cnc_read_prog2_bg(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_read_prog3_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer, charPtr3: ByteBuffer): Short
  def cnc_start_async_read_prog3(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_read_prog3(short1: Short, charPtr1: ByteBuffer, shortPtr1: ShortBuffer): Short
  def cnc_start_async_read_prog3_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_read_prog3_bg(
      short1: Short,
      charPtr1: ByteBuffer,
      charPtr2: ByteBuffer,
      shortPtr1: ShortBuffer
  ): Short
  def cnc_pdf_read(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_read_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_start_async_pdf_read(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_end_async_pdf_read(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_pdf_read_start(short1: Short, short2: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer, short3: Short): Short
  def cnc_pdf_read_poll(short1: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_pdf_read_end(short1: Short): Short
  def cnc_pdf_read_restart(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_stop_async_read_punch(h: Short): Short
  def cnc_verify_prog(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_verify_prog_bg(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_punch_data(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_read_data(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_punch_data_start(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      long2: NativeLong,
      charPtr1: ByteBuffer
  ): Short
  def cnc_punch_data_end(
      short1: Short,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference,
      shortPtr1: ShortBuffer
  ): Short
  def cnc_start_async_data_punch(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_end_async_data_punch(short1: Short, short2: Short, shortPtr1: ShortBuffer): Short
  def cnc_start_async_data_read(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_end_async_data_read(short1: Short, short2: Short, shortPtr1: ShortBuffer): Short
  def cnc_mcdp_unmount(short1: Short): Short
  def cnc_mcdp_mountchk(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_mcdp_mount(short1: Short): Short
  def cnc_mcdp_update_entry(short1: Short, long1: NativeLong): Short
  def cnc_mcdp_wractpt(short1: Short, charPtr1: ByteBuffer, long1: NativeLong, longPtr1: NativeLongByReference): Short
  def cnc_rdactpt_w(short1: Short, short2: Short, ODBACTPTWPtr1: odbactptw): Short
  def cnc_wractpt_w(short1: Short, short2: Short, long1: NativeLong): Short
  def cnc_pdf_dncset(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_dncset2(short1: Short, charPtr1: ByteBuffer, short2: Short): Short
  def cnc_pdf_dncread(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_pdf_mergeprog(
      short1: Short,
      short2: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      long2: NativeLong,
      charPtr2: ByteBuffer
  ): Short
  def cnc_rdembedf_inf(
      short1: Short,
      charPtr1: ByteBuffer,
      short2: Short,
      ODBEMBEDFINFPtr1: odbembedfinf.ByReference
  ): Short
  def cnc_setpdf_pglockexec(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_getsysfolder_num(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_getexemacstat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_pdf_relsmain(short1: Short): Short
  def cnc_rdtofs(short1: Short, short2: Short, short3: Short, short4: Short, ODBTOFSPtr1: odbtofs.ByReference): Short
  def cnc_wrtofs(short1: Short, short2: Short, short3: Short, short4: Short, long1: NativeLong): Short
  def cnc_rdtofsr(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBTOPtr1: iodbto.ByReference
  ): Short
  def cnc_wrtofsr(short1: Short, short2: Short, IODBTOPtr1: iodbto.ByReference): Short
  def cnc_clrtofs(short1: Short, short2: Short): Short
  def cnc_rdzofs(short1: Short, short2: Short, short3: Short, short4: Short, IODBZOFSPtr1: iodbzofs.ByReference): Short
  def cnc_wrzofs(short1: Short, short2: Short, IODBZOFSPtr1: iodbzofs.ByReference): Short
  def cnc_rdzofsr(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBZORPtr1: iodbzor.ByReference
  ): Short
  def cnc_wrzofsr(short1: Short, short2: Short, IODBZORPtr1: iodbzor.ByReference): Short
  def cnc_rdmsptype(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBMSTPPtr1: iodbmstp.ByReference
  ): Short
  def cnc_wrmsptype(short1: Short, short2: Short, IODBMSTPPtr1: iodbmstp.ByReference): Short
  def cnc_rdparam(short1: Short, short2: Short, short3: Short, short4: Short, IODBPSDPtr1: iodbpsd.ByReference): Short
  def cnc_rdparam3(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBPSDPtr1: iodbpsd.ByReference
  ): Short
  def cnc_wrparam(short1: Short, short2: Short, IODBPSDPtr1: iodbpsd.ByReference): Short
  def cnc_wrparam3(short1: Short, short2: Short, short3: Short, IODBPSDPtr1: iodbpsd.ByReference): Short
  def cnc_rdparar(
      short1: Short,
      shortPtr1: ShortBuffer,
      short2: Short,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_rdparar3(
      short1: Short,
      shortPtr1: ShortBuffer,
      short2: Short,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      short3: Short,
      voidPtr1: Pointer
  ): Short
  def cnc_wrparas(short1: Short, short2: Short, voidPtr1: Pointer): Short
  def cnc_wrparas3(short1: Short, short2: Short, short3: Short, voidPtr1: Pointer): Short
  def cnc_preset_prm(short1: Short, short2: Short, IODBBOOKPtr1: iodbbook.ByReference): Short
  def cnc_validate_prm(short1: Short, short2: Short): Short
  def cnc_cancel_prm(short1: Short, short2: Short): Short
  def cnc_rdcncid(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_sramstat(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBOPMSGPtr1: odbopmsg.ByReference): Short
  def cnc_sramstatus(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      ODBSRAMSTATPtr1: odbsramstat.ByReference
  ): Short
  def cnc_validate_opt(short1: Short, slct: Short): Short
  def cnc_rdset(short1: Short, short2: Short, short3: Short, short4: Short, IODBPSDPtr1: iodbpsd.ByReference): Short
  def cnc_wrset(short1: Short, short2: Short, IODBPSDPtr1: iodbpsd.ByReference): Short
  def cnc_rdsetr(
      short1: Short,
      shortPtr1: ShortBuffer,
      short2: Short,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_wrsets(short1: Short, short2: Short, voidPtr1: Pointer): Short
  def cnc_rdparam_ext(
      short1: Short,
      longPtr1: NativeLongByReference,
      short2: Short,
      IODBPRMPtr1: iodbprm.ByReference
  ): Short
  def cnc_start_async_wrparam(short1: Short, IODBPRMPtr1: iodbprm.ByReference): Short
  def cnc_end_async_wrparam(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_async_busy_state(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rddiag_ext(
      short1: Short,
      longPtr1: NativeLongByReference,
      short2: Short,
      IODBPRMPtr1: iodbprm.ByReference
  ): Short
  def cnc_rdpitchr(short1: Short, short2: Short, short3: Short, short4: Short, IODBPIPtr1: iodbpi.ByReference): Short
  def cnc_wrpitchr(short1: Short, short2: Short, IODBPIPtr1: iodbpi.ByReference): Short
  def cnc_rdpitchr2(short1: Short, short2: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_wrpitchr2(short1: Short, short2: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_checkpitch(short1: Short, short2: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_rdhipitchr(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_wrhipitchr(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdhipitchinfo(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdmacro(short1: Short, short2: Short, short3: Short, ODBMPtr1: odbm.ByReference): Short
  def cnc_wrmacro(short1: Short, short2: Short, short3: Short, long1: NativeLong, short4: Short): Short
  def cnc_rdmacro2(short1: Short, short2: Short, short3: Short, ODBMPtr1: odbm.ByReference): Short
  def cnc_rdmacro3(short1: Short, long1: NativeLong, short2: Short, ODBM3Ptr1: odbm3.ByReference): Short
  def cnc_wrmacro3(short1: Short, long1: NativeLong, short2: Short, long2: NativeLong, short3: Short): Short
  def cnc_rdmacror(short1: Short, short2: Short, short3: Short, short4: Short, IODBMRPtr1: iodbmr.ByReference): Short
  def cnc_wrmacror(short1: Short, short2: Short, IODBMRPtr1: iodbmr.ByReference): Short
  def cnc_rdmacror2(short1: Short, long1: NativeLong, longPtr1: NativeLongByReference, doublePtr1: DoubleBuffer): Short
  def cnc_rdmacror2_name(short1: Short, long1: NativeLong, longPtr1: NativeLongByReference, pdb: iodbmnr): Short
  def cnc_rdmacror3(short1: Short, long1: NativeLong, longPtr1: NativeLongByReference, pdb: iodbmnr3): Short
  def cnc_wrmacror2(short1: Short, long1: NativeLong, longPtr1: NativeLongByReference, doublePtr1: DoubleBuffer): Short
  def cnc_rdmacro_bg(short1: Short, short2: Short, short3: Short, ODBMPtr1: odbm.ByReference): Short
  def cnc_wrmacro_bg(short1: Short, short2: Short, short3: Short, long1: NativeLong, short4: Short): Short
  def cnc_rdmacronum(
      short1: Short,
      charPtr1: ByteBuffer,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      shortPtr1: ShortBuffer
  ): Short
  def cnc_rdpmacro(short1: Short, long1: NativeLong, ODBPMPtr1: odbpm.ByReference): Short
  def cnc_wrpmacro(short1: Short, long1: NativeLong, long2: NativeLong, short2: Short): Short
  def cnc_rdpmacror(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      short2: Short,
      IODBPRPtr1: iodbpr.ByReference
  ): Short
  def cnc_wrpmacror(short1: Short, short2: Short, IODBPRPtr1: iodbpr.ByReference): Short
  def cnc_rdpmacror2(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      short2: Short,
      doublePtr1: DoubleBuffer
  ): Short
  def cnc_wrpmacror2(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      short2: Short,
      doublePtr1: DoubleBuffer
  ): Short
  def cnc_rdpmacror_bg(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      doublePtr1: DoubleBuffer
  ): Short
  def cnc_wrpmacror_bg(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      doublePtr1: DoubleBuffer
  ): Short
  def cnc_rdtofsinfo(short1: Short, ODBTLINFPtr1: odbtlinf.ByReference): Short
  def cnc_rdtofsinfo2(short1: Short, ODBTLINF2Ptr1: odbtlinf2.ByReference): Short
  def cnc_rdzofsinfo(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdholmes(short1: Short, ODBHOLDATAPtr1: ODBHOLDATA.ByReference): Short
  def cnc_rdenblinfo(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdcenblinfo(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdzofsmes(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      long3: NativeLong,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdtldata(short1: Short, ODBTLDATAPtr1: tldata.ByReference): Short
  def cnc_wrtldata(short1: Short, long1: NativeLong, long2: NativeLong, long3: NativeLong): Short
  def cnc_rdcenter(
      short1: Short,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference,
      longPtr3: NativeLongByReference,
      longPtr4: NativeLongByReference,
      longPtr5: NativeLongByReference,
      longPtr6: NativeLongByReference
  ): Short
  def cnc_rdtlmsinfo(short1: Short, ODBTLMSINFPtr1: tlmsinf.ByReference): Short
  def cnc_rdtofsenbl(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_wrtofsms(short1: Short, long1: NativeLong, long2: NativeLong): Short
  def cnc_rdpitchinfo(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdmacroinfo(short1: Short, ODBMVINFPtr1: odbmvinf.ByReference): Short
  def cnc_rdmacrolclevel(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdmacrolcval(short1: Short, short2: Short, short3: Short, short4: Short, doublePtr1: DoubleBuffer): Short
  def cnc_rdpitchblkinfo(short1: Short, IODBPITCHBLKPtr1: tagIODBPITCHBLK.ByReference): Short
  def cnc_rdvolc(short1: Short, ODBVOLCPtr1: tagODBVOLC.ByReference, longPtr1: NativeLongByReference): Short
  def cnc_wrvolc(short1: Short, ODBVOLCPtr1: tagODBVOLC.ByReference, longPtr1: NativeLongByReference): Short
  def cnc_rdvolccomp(short1: Short, ODBVOLCOMPPtr1: tagODBVOLCOMP.ByReference): Short
  def cnc_dvpunchvolc(short1: Short, ODBVOLCOMPPtr1: tagODBVOLCOMP.ByReference): Short
  def cnc_dvreadvolc(short1: Short, ODBVOLCOMPPtr1: tagODBVOLCOMP.ByReference): Short
  def cnc_rdrotvolc(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      IODBROTVOLCPtr1: iodbrotvolc.ByReference
  ): Short
  def cnc_wrrotvolc(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      IODBROTVOLCPtr1: iodbrotvolc.ByReference
  ): Short
  def cnc_wrrotvolc2(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      IODBROTVOLCPtr1: iodbrotvolc.ByReference
  ): Short
  def cnc_rdpmacroinfo(short1: Short, ODBPMINFPtr1: odbpminf.ByReference): Short
  def cnc_rdpmacroinfo2(short1: Short, ODBPMINF2Ptr1: odbpminf2.ByReference): Short
  def cnc_rdpmacroinfo3(short1: Short, ODBPMINF3Ptr1: odbpminf3.ByReference): Short
  def cnc_rdpmacvalflag(short1: Short, ODBPMVALFLGPtr1: odbpmvalflg.ByReference): Short
  def cnc_tofs_rnge(short1: Short, short2: Short, short3: Short, ODBDATRNGPtr1: odbdatrng.ByReference): Short
  def cnc_zofs_rnge(short1: Short, short2: Short, short3: Short, ODBDATRNGPtr1: odbdatrng.ByReference): Short
  def cnc_wksft_rnge(short1: Short, short2: Short, ODBDATRNGPtr1: odbdatrng.ByReference): Short
  def cnc_rdhsprminfo(short1: Short, long1: NativeLong, HSPINFOPtr1: hspinfo.ByReference): Short
  def cnc_rdhsparam(
      short1: Short,
      long1: NativeLong,
      HSPINFOPtr1: hspinfo.ByReference,
      HSPDATAPtr1: hspdata.ByReference
  ): Short
  def cnc_rdhsparamm(
      short1: Short,
      long1: NativeLong,
      HSPINFOPtr1: hspinfo.ByReference,
      HSPDATAMPtr1: hspdatam.ByReference
  ): Short
  def cnc_rdmofs(short1: Short, short2: Short, short3: Short, longPtr1: NativeLongByReference): Short
  def cnc_wrmofs(short1: Short, short2: Short, short3: Short, short4: Short, long1: NativeLong): Short
  def cnc_clrmofs(short1: Short, short2: Short, short3: Short): Short
  def cnc_rdtlgeomsize(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSPtr1: IODBTLGS.ByReference
  ): Short
  def cnc_wrtlgeomsize(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSPtr1: IODBTLGS.ByReference
  ): Short
  def cnc_rdtlgeomsize_ext(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSEXTPtr1: iodbtlgsext.ByReference
  ): Short
  def cnc_wrtlgeomsize_ext(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSEXTPtr1: iodbtlgsext.ByReference
  ): Short
  def cnc_rdtlgeomsize_ext2(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSEXT2Ptr1: iodbtlgsext2.ByReference
  ): Short
  def cnc_wrtlgeomsize_ext2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      IODBTLGSEXT2Ptr1: iodbtlgsext2.ByReference
  ): Short
  def cnc_rdgrpid(short1: Short, short2: Short, ODBTLIFE1Ptr1: odbtlife1.ByReference): Short
  def cnc_rdngrp(short1: Short, ODBTLIFE2Ptr1: odbtlife2.ByReference): Short
  def cnc_rdntool(short1: Short, short2: Short, ODBTLIFE3Ptr1: odbtlife3.ByReference): Short
  def cnc_rdlife(short1: Short, short2: Short, ODBTLIFE3Ptr1: odbtlife3.ByReference): Short
  def cnc_rdcount(short1: Short, short2: Short, ODBTLIFE3Ptr1: odbtlife3.ByReference): Short
  def cnc_rd1length(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_rd2length(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_rd1radius(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_rd2radius(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_t1info(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_t2info(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_toolnum(short1: Short, short2: Short, short3: Short, ODBTLIFE4Ptr1: odbtlife4.ByReference): Short
  def cnc_rdtoolrng(short1: Short, short2: Short, short3: Short, short4: Short, IODBTRPtr1: iodbtr.ByReference): Short
  def cnc_rdtoolgrp(short1: Short, short2: Short, short3: Short, ODBTGPtr1: odbtg.ByReference): Short
  def cnc_wrcountr(short1: Short, short2: Short, IDBWRCPtr1: idbwrc.ByReference): Short
  def cnc_rdusegrpid(short1: Short, ODBUSEGRPtr1: odbusegr.ByReference): Short
  def cnc_rdmaxgrp(short1: Short, ODBLFNOPtr1: odblfno.ByReference): Short
  def cnc_rdmaxtool(short1: Short, ODBLFNOPtr1: odblfno.ByReference): Short
  def cnc_rdusetlno(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBTLUSEPtr1: odbtluse.ByReference
  ): Short
  def cnc_rd1tlifedata(short1: Short, short2: Short, short3: Short, IODBTDPtr1: iodbtd.ByReference): Short
  def cnc_rd2tlifedata(short1: Short, short2: Short, short3: Short, IODBTDPtr1: iodbtd.ByReference): Short
  def cnc_wr1tlifedata(short1: Short, IODBTDPtr1: iodbtd.ByReference): Short
  def cnc_wr2tlifedata(short1: Short, IODBTDPtr1: iodbtd.ByReference): Short
  def cnc_rdgrpinfo(short1: Short, short2: Short, short3: Short, short4: Short, IODBTGIPtr1: iodbtgi.ByReference): Short
  def cnc_rdgrpinfo2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBTGI2Ptr1: iodbtgi2.ByReference
  ): Short
  def cnc_rdgrpinfo3(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBTGI3Ptr1: iodbtgi3.ByReference
  ): Short
  def cnc_rdgrpinfo4(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      IODBTGI4Ptr1: iodbtgi4.ByReference
  ): Short
  def cnc_wrgrpinfo(short1: Short, short2: Short, IODBTGIPtr1: iodbtgi.ByReference): Short
  def cnc_wrgrpinfo2(short1: Short, short2: Short, IODBTGI2Ptr1: iodbtgi2.ByReference): Short
  def cnc_wrgrpinfo3(short1: Short, short2: Short, IODBTGI3Ptr1: iodbtgi3.ByReference): Short
  def cnc_deltlifegrp(short1: Short, short2: Short): Short
  def cnc_instlifedt(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_deltlifedt(short1: Short, short2: Short, short3: Short): Short
  def cnc_clrcntinfo(short1: Short, short2: Short, short3: Short): Short
  def cnc_rdgrpid2(short1: Short, long1: NativeLong, ODBTLIFE5Ptr1: odbtlife5.ByReference): Short
  def cnc_rd1tlifedat2(short1: Short, short2: Short, long1: NativeLong, IODBTD2Ptr1: iodbtd2.ByReference): Short
  def cnc_wr1tlifedat2(short1: Short, IODBTD2Ptr1: iodbtd2.ByReference): Short
  def cnc_rdtlinfo(short1: Short, ODBTLINFOPtr1: odbtlinfo.ByReference): Short
  def cnc_rdtlusegrp(short1: Short, ODBUSEGRPPtr1: odbusegrp.ByReference): Short
  def cnc_rdtlgrp(short1: Short, long1: NativeLong, shortPtr1: ShortBuffer, IODBTLGRPPtr1: iodbtlgrp.ByReference): Short
  def cnc_rdtltool(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      shortPtr1: ShortBuffer,
      IODBTLTOOLPtr1: iodbtltool.ByReference
  ): Short
  def cnc_rdtoolchggrp(short1: Short, short2: Short, short3: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdcntover(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdexchgtgrp(short1: Short, shortPtr1: ShortBuffer, ODBEXGPPtr1: exgrp.ByReference): Short
  def cnc_rdcnttype(short1: Short, short2: Short, ODBTLIFE3Ptr1: odbtlife3.ByReference): Short
  def cnc_wrtoolgrp(short1: Short, long1: NativeLong, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wrlife(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wrcount(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wrcnttype(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wr1length(short1: Short, IDBITD2Ptr1: idbitd2.ByReference): Short
  def cnc_wr2length(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wr1radius(short1: Short, IDBITD2Ptr1: idbitd2.ByReference): Short
  def cnc_wr2radius(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wrt1info(short1: Short, IDBITD2Ptr1: idbitd2.ByReference): Short
  def cnc_wrt2info(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_wrtoolnum(short1: Short, IDBITDPtr1: idbitd.ByReference): Short
  def cnc_read_cexeinfo(short1: Short, short2: Short, CEXEINFOPtr1: cexeinfo.ByReference): Short
  def cnc_regtool(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLMNGPtr1: iodbtlmng.ByReference): Short
  def cnc_regtool_f2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTLMNG_F2Ptr1: iodbtlmng_f2.ByReference
  ): Short
  def cnc_deltool(short1: Short, short2: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdtool(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLMNGPtr1: iodbtlmng.ByReference): Short
  def cnc_rdtool2(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBTLM2Ptr1: iodbtlm2.ByReference
  ): Short
  def cnc_rdtool_f2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTLMNG_F2Ptr1: iodbtlmng_f2.ByReference
  ): Short
  def cnc_wrtool(short1: Short, short2: Short, IODBTLMNGPtr1: iodbtlmng.ByReference): Short
  def cnc_wrtool_f2(short1: Short, short2: Short, IODBTLMNG_F2Ptr1: iodbtlmng_f2.ByReference): Short
  def cnc_wrtool2(short1: Short, short2: Short, IDBTLMPtr1: idbtlm.ByReference): Short
  def cnc_regmagazine(short1: Short, shortPtr1: ShortBuffer, IODBTLMAGPtr1: iodbtlmag.ByReference): Short
  def cnc_delmagazine(short1: Short, shortPtr1: ShortBuffer, IODBTLMAG2Ptr1: iodbtlmag2.ByReference): Short
  def cnc_rdmagazine(short1: Short, shortPtr1: ShortBuffer, IODBTLMAGPtr1: iodbtlmag.ByReference): Short
  def cnc_wrmagazine(short1: Short, short2: Short, short3: Short, short4: Short): Short
  def cnc_rdctname(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_rdtlname(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_rdhdnxt(short1: Short, longPtr1: NativeLongByReference, longPtr2: NativeLongByReference): Short
  def cnc_rdtldspcstms(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdtldspcstms2(short1: Short, short2: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdspdlwaitname(short1: Short, IODBTLSPWTNAMEPtr1: iodbtlname.ByReference): Short
  def cnc_rdcstmdecfig(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdtlnewstatus(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdtoolgeom_tlm(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTLGEOMPtr1: tlmngtlgeom.ByReference
  ): Short
  def cnc_wrtoolgeom_tlm(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTLGEOMPtr1: tlmngtlgeom.ByReference
  ): Short
  def cnc_btlfpotsrh(short1: Short, short2: Short, short3: Short, short4: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdinterference(short1: Short, IODBTLINTFPtr1: iodbtlintf.ByReference): Short
  def cnc_rdtoollife_count(short1: Short, char1: Byte, shortPtr1: ShortBuffer): Short
  def cnc_rdtoollife_data(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTL_RDTYPE1: iodbtl_retype.ByValue,
      IODBTLLFPtr1: iodbtllf.ByReference
  ): Short
  def cnc_rdtoollifed_count(short1: Short, long1: NativeLong, shortPtr1: ShortBuffer): Short
  def cnc_rdtoollifed_data(
      short1: Short,
      long1: NativeLong,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTLLFDPtr1: iodbtllfd.ByReference
  ): Short
  def cnc_rdtoollife_tcodedata(short1: Short, long1: NativeLong, char1: Byte, IODBTLLFPtr1: iodbtllf.ByReference): Short
  def cnc_rdtlmgr_check(short1: Short, IODBTLMGR_CHECKPtr1: iodbtlmgr_check.ByReference): Short
  def cnc_tool_in(short1: Short, shortPtr1: ShortBuffer, IODBTLMNG_F2Ptr1: iodbtlmng_f2.ByReference): Short
  def cnc_tool_out(short1: Short, char1: Byte, IODBTLMAG2Ptr1: iodbtlmag2.ByReference): Short
  def cnc_rdtool_inhis(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTOOL_INHISPtr1: iodbtool_inhis.ByReference
  ): Short
  def cnc_rdtool_outhis(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBTOOL_OUTHISPtr1: iodbtool_outhis.ByReference
  ): Short
  def cnc_rdtool_cause(short1: Short, IODBTOOL_CAUSENMEPtr1: iodbtool_causenme.ByReference): Short
  def cnc_tool_temp_in(short1: Short, IODBTLMAG2Ptr1: iodbtlmag2.ByReference): Short
  def cnc_tool_temp_out(short1: Short, IODBTLMAG2Ptr1: iodbtlmag2.ByReference): Short
  def cnc_tool_in2(short1: Short, IODBTLMAGPtr1: iodbtlmag.ByReference): Short
  def cnc_srttl_getnum(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      long2: NativeLong,
      shortPtr1: ShortBuffer
  ): Short
  def cnc_srttl_getdata(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      short3: Short,
      long1: NativeLong,
      long2: NativeLong,
      IODBTLMNG_SORTPtr1: iodbtlmng_sort.ByReference
  ): Short
  def cnc_rdtlmgr_name(short1: Short, short2: Short, short3: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_rdcstm_decfig(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      charPtr1: ByteBuffer
  ): Short
  def cnc_rdmag_property(short1: Short, shortPtr1: ShortBuffer, IODBMAGPRTYPtr1: iodbmagprty.ByReference): Short
  def cnc_wrmag_property(short1: Short, shortPtr1: ShortBuffer, IODBMAGPRTYPtr1: iodbmagprty.ByReference): Short
  def cnc_rdpot_property(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBPOTPRTYPtr1: iodbpotprty.ByReference
  ): Short
  def cnc_wrpot_property(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      IODBPOTPRTYPtr1: iodbpotprty.ByReference
  ): Short
  def cnc_delmag_property(short1: Short, shortPtr1: ShortBuffer, IODBMAGPRTY2Ptr1: iodbmagprty2.ByReference): Short
  def cnc_delpot_property(short1: Short, short2: Short, short3: Short, shortPtr1: ShortBuffer): Short
  def cnc_tool_move(
      short1: Short,
      IODBTLMAG2Ptr1: iodbtlmag2.ByReference,
      IODBTLMAG2Ptr2: iodbtlmag2.ByReference
  ): Short
  def cnc_reg_toolstrage(short1: Short, char1: Byte, IODBTLMAGPtr1: iodbtlmag.ByReference): Short
  def cnc_magazinesrch(
      short1: Short,
      short2: Short,
      IDBTLM_SRCHDT1: idbtlm_srchdt.ByValue,
      IODBTLMAG_SRCHINFOPtr1: iodbtlmag_srchinfo.ByReference
  ): Short
  def cnc_toolsrch(
      short1: Short,
      short2: Short,
      short3: Short,
      IDBTLM_SRCHDT1: idbtlm_srchdt.ByValue,
      shortPtr1: ShortBuffer
  ): Short
  def cnc_rdedgedata(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBTLMNG_MU_EDGEPtr1: odbtlmng_mu_edge.ByReference
  ): Short
  def cnc_wredgedata(
      short1: Short,
      short2: Short,
      short3: Short,
      IODBTLMNG_MU_EDGE_DATAPtr1: iodbtlmng_mu_edge_data.ByReference
  ): Short
  def cnc_wredgedata2(short1: Short, short2: Short, short3: Short, IDBTLMPtr1: idbtlm.ByReference): Short
  def cnc_rdedgedatapage(
      short1: Short,
      IDBTLMGR_ADD_INFO1: idbtlmgr_add_info.ByValue,
      char1: Byte,
      shortPtr1: ShortBuffer,
      IODBTLMGR_PAGEPtr1: iodbtlmgr_page.ByReference
  ): Short
  def cnc_rdedgeactive(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_tool_in3(
      short1: Short,
      shortPtr1: ShortBuffer,
      IODBTLMNG_F2Ptr1: iodbtlmng_f2.ByReference,
      IODBTLMNG_MU_EDGE_DATAPtr1: iodbtlmng_mu_edge_data.ByReference
  ): Short
  def cnc_stopophis(short1: Short): Short
  def cnc_startophis(short1: Short): Short
  def cnc_rdophisno(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdophistry(short1: Short, short2: Short, short3: Short, short4: Short, ODBHISPtr1: odbhis.ByReference): Short
  def cnc_rdophistry2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_rdophistry3(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_rdalmhisno(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdalmhistry(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHISPtr1: odbahis.ByReference
  ): Short
  def cnc_rdalmhistry_w(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHISPtr1: odbahis.ByReference
  ): Short
  def cnc_rdalmhistry2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHIS2Ptr1: odbahis2.ByReference
  ): Short
  def cnc_rdalmhistry3(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHIS3Ptr1: odbahis3.ByReference
  ): Short
  def cnc_clearophis(short1: Short, short2: Short): Short
  def cnc_backupophis(short1: Short): Short
  def cnc_rdhissgnl(short1: Short, IODBSIGPtr1: iodbsig.ByReference): Short
  def cnc_rdhissgnl2(short1: Short, IODBSIG2Ptr1: iodbsig2.ByReference): Short
  def cnc_rdhissgnl3(short1: Short, IODBSIG3Ptr1: iodbsig3.ByReference): Short
  def cnc_wrhissgnl(short1: Short, IODBSIGPtr1: iodbsig.ByReference): Short
  def cnc_wrhissgnl2(short1: Short, IODBSIG2Ptr1: iodbsig2.ByReference): Short
  def cnc_wrhissgnl3(short1: Short, IODBSIG3Ptr1: iodbsig3.ByReference): Short
  def cnc_rdophistry4(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_rdophisno4(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdomhisno(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdalmhistry4(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHIS4Ptr1: odbahis4.ByReference
  ): Short
  def cnc_rdomhistry2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBOMHIS2Ptr1: odbmhis2.ByReference
  ): Short
  def cnc_rdophisno3(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdalmhisno3(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdalmhistry5(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBAHIS5Ptr1: odbahis5.ByReference
  ): Short
  def cnc_wrkeyhistry(short1: Short, char1: Byte): Short
  def cnc_rdtdiinfo(short1: Short, ODBINFPtr1: odbinf.ByReference): Short
  def cnc_rdtdinamesetting(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBNMEPtr1: odbnme.ByReference
  ): Short
  def cnc_wrtdinamesetting(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBNMEPtr1: odbnme.ByReference
  ): Short
  def cnc_rdtdifignum(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrtdifignum(short1: Short, short2: Short): Short
  def cnc_rdtdidispsetting(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBDSTPtr1: odbdst.ByReference
  ): Short
  def cnc_wrtdidispsetting(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBDSTPtr1: odbdst.ByReference
  ): Short
  def cnc_rdtdishapedata(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      ODBSHPPtr1: odbshp.ByReference
  ): Short
  def cnc_wrtdishapedata(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      ODBSHPPtr1: odbshp.ByReference
  ): Short
  def cnc_rdtdicubedata(short1: Short, short2: Short, ODBCUBPtr1: odbcub.ByReference): Short
  def cnc_wrtdicubedata(short1: Short, short2: Short, ODBCUBPtr1: odbcub.ByReference): Short
  def cnc_rdtdicubeinfo(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBCBIPtr1: odbcbi.ByReference): Short
  def cnc_rdtdieffectshape(short1: Short, short2: Short, short3: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrtdieffectshape(short1: Short, short2: Short, short3: Short, short4: Short): Short
  def cnc_rdtdimoveaxis(short1: Short, short2: Short, short3: Short, ODBMVAPtr1: odbmva.ByReference): Short
  def cnc_wrtdimoveaxis(short1: Short, short2: Short, short3: Short, ODBMVAPtr1: odbmva.ByReference): Short
  def cnc_rdtdiseltool(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference
  ): Short
  def cnc_rdtdicurrentshape(short1: Short, short2: Short, short3: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdtdicrntshapeinf(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      shortPtr1: ShortBuffer,
      ODBCRNTSHPPtr1: odbcrntshp.ByReference
  ): Short
  def cnc_opentdicubeinfo(FlibHndl: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_seqrdtdicubeinfo(
      FlibHndl: Short,
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      ODBCBIPtr1: odbcbi.ByReference
  ): Short
  def cnc_rdtdicylinderdata(short1: Short, short2: Short, ODBCYLPtr1: odbcyl.ByReference): Short
  def cnc_wrtdicylinderdata(short1: Short, short2: Short, ODBCYLPtr1: odbcyl.ByReference): Short
  def cnc_rdtdiplanedata(short1: Short, short2: Short, ODBPLNPtr1: odbpln.ByReference): Short
  def cnc_wrtdiplanedata(short1: Short, short2: Short, ODBPLNPtr1: odbpln.ByReference): Short
  def cnc_rdtdifiguredata(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBFIGPtr1: odbfig.ByReference): Short
  def cnc_wrtdifiguredata(short1: Short, short2: Short, short3: Short, ODBFIGPtr1: odbfig.ByReference): Short
  def cnc_rdtdiinitview(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrtdiinitview(short1: Short, short2: Short): Short
  def cnc_settdiobjectshape(short1: Short, short2: Short, short3: Short): Short
  def cnc_settditoolshape(short1: Short, short2: Short, short3: Short): Short
  def cnc_rdtdicomment(FlibHndl: Short, length: ShortBuffer, comment: ByteBuffer): Short
  def cnc_wrtdicomment(FlibHndl: Short, length: ShortBuffer, comment: ByteBuffer): Short
  def cnc_rdtdicolordata(FlibHndl: Short, ob_type: Short, ob_s_no: Short, rd_num: Short, data: ByteBuffer): Short
  def cnc_wrtdicolordata(FlibHndl: Short, ob_type: Short, ob_s_no: Short, wrt_num: Short, data: ByteBuffer): Short
  def cnc_mdg_rdalmnum(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_mdg_rdalminfo(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference
  ): Short
  def cnc_mdg_rdmsg(
      short1: Short,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference,
      ODBMDGMSGPtr1: odbmdgmsg.ByReference
  ): Short
  def cnc_mdg_rdflow(
      short1: Short,
      short2: Short,
      short3: Short,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference,
      ODBMDGFLOWPtr1: odbmdgflow.ByReference
  ): Short
  def cnc_mdg_rddtmsg(
      short1: Short,
      short2: Short,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference,
      ODBMDGDTMSGPtr1: odbmdgdtmsg.ByReference
  ): Short
  def cnc_mdg_rdmsgnum(short1: Short, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_mdg_msgsrch(short1: Short, short2: Short, long1: NativeLong, longPtr1: NativeLongByReference): Short
  def cnc_mdg_rdmsgordr(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBMDGMSGPtr1: odbmdgmsg.ByReference
  ): Short
  def cnc_mdg_rdcontinfo(
      short1: Short,
      shortPtr1: ShortBuffer,
      longPtr1: NativeLongByReference,
      longPtr2: NativeLongByReference,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference
  ): Short
  def cnc_mdg_rdorderalmno(
      short1: Short,
      IODBMDGINFOPtr1: iodbmdginfo.ByReference,
      longPtr1: NativeLongByReference
  ): Short
  def cnc_mdg_rdlatchedalm(short1: Short, IODBMDGINFOPtr1: iodbmdginfo.ByReference, shortPtr1: ShortBuffer): Short
  def cnc_mdg_rdalminfoview2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBVIEWGRP2Ptr1: odbviewgrp2.ByReference
  ): Short
  def cnc_mdg_rdwvdata(short1: Short, short2: Short, char1: Byte, ODBMDGWVDTPtr1: odbmdgwvdt.ByReference): Short
  def cnc_mdg_rdheatsimlt(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBLOADPtr1: odbload.ByReference
  ): Short
  def cnc_mdg_rdloadlvl(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ODBLOADPtr1: odbload.ByReference
  ): Short
  def cnc_mdg_monistat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_mdg_moniclear(short1: Short): Short
  def cnc_mdg_rdsysinfo(short1: Short, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_sysinfo(short1: Short, ODBSYSPtr1: odbsys.ByReference): Short
  def cnc_statinfo(short1: Short, ODBSTPtr1: odbst.ByReference): Short
  def cnc_statinfo2(short1: Short, ODBST2Ptr1: odbst2.ByReference): Short
  def cnc_rdmovestate(short1: Short, short2: Short, shortPtr1: ShortBuffer, charPtr1: ByteBuffer): Short
  def cnc_statinfo_dmg(short1: Short, OUT_STATINF_DMGPtr1: out_statinfo_dmg.ByReference): Short
  def cnc_rdcmstatdata(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_alarm(short1: Short, ODBALMPtr1: odbalm.ByReference): Short
  def cnc_alarm2(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_clearalm(short1: Short, short2: Short): Short
  def cnc_rdalminfo(short1: Short, short2: Short, short3: Short, short4: Short, ALMINFOPtr1: alminfo.ByReference): Short
  def cnc_rdalminfo2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      ALMINFO2Ptr1: alminfo2.ByReference
  ): Short
  def cnc_rdalmmsg(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBALMMSGPtr1: odbalmmsg.ByReference): Short
  def cnc_rdalmmsg2(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBALMMSG2Ptr1: odbalmmsg2.ByReference): Short
  def cnc_rdalmmsg3(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBALMMSG3Ptr1: odbalmmsg3.ByReference): Short
  def cnc_clralm(hndl: Short, id1: Short): Short
  def cnc_modal(short1: Short, short2: Short, short3: Short, ODBMDLPtr1: odbmdl.ByReference): Short
  def cnc_cannedcycle(short1: Short, ODBCANCMDPtr1: odbcancmd.ByReference): Short
  def cnc_rdgcode(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBGCDPtr1: odbgcd.ByReference
  ): Short
  def cnc_rdgcodem(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBGCDPtr1: odbgcd.ByReference
  ): Short
  def cnc_block_status(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdcommand(
      short1: Short,
      short2: Short,
      short3: Short,
      shortPtr1: ShortBuffer,
      ODBCMDPtr1: odbcmd.ByReference
  ): Short
  def cnc_diagnoss(short1: Short, short2: Short, short3: Short, short4: Short, ODBDGNPtr1: odbdgn.ByReference): Short
  def cnc_diagnosr(
      short1: Short,
      shortPtr1: ShortBuffer,
      short2: Short,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      voidPtr1: Pointer
  ): Short
  def cnc_adcnv(short1: Short, short2: Short, short3: Short, ODBADPtr1: odbad.ByReference): Short
  def cnc_rdopmsg(short1: Short, short2: Short, short3: Short, OPMSGPtr1: msg.ByReference): Short
  def cnc_rdopmsg2(short1: Short, short2: Short, short3: Short, OPMSG2Ptr1: opmsg2.ByReference): Short
  def cnc_rdopmsg3(short1: Short, short2: Short, shortPtr1: ShortBuffer, OPMSG3Ptr1: opmsg3.ByReference): Short
  def cnc_rdopmsg3m(short1: Short, short2: Short, shortPtr1: ShortBuffer, OPMSG3Ptr1: opmsg3.ByReference): Short
  def cnc_rdlnopmsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdopmsgmps(short1: Short, short2: Short, shortPtr1: ShortBuffer, OPMSGMPSPtr1: OPMSGMPS.ByReference): Short
  def cnc_setpath(short1: Short, short2: Short): Short
  def cnc_getpath(short1: Short, shortPtr1: ShortBuffer, shortPtr2: ShortBuffer): Short
  def cnc_allclibhndl(shortPtr1: ShortBuffer): Short
  def cnc_allclibhndl3(ipaddr: String, port: Short, timeout: NativeLong, FlibHndl: ShortBuffer): Short
  def cnc_freelibhndl(short1: Short): Short
  def cnc_getlibopt(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, longPtr1: NativeLongByReference): Short
  def cnc_setlibopt(short1: Short, long1: NativeLong, charPtr1: ByteBuffer, long2: NativeLong): Short
  def cnc_getmactype(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_setmactype(short1: Short, short2: Short): Short
  def cnc_getpmactype(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_setpmactype(short1: Short, short2: Short): Short
  def cnc_getcrntscrn(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_slctscrn(short1: Short, short2: Short): Short
  def cnc_sysconfig(short1: Short, ODBSYSCPtr1: odbsysc.ByReference): Short
  def cnc_rdprstrinfo(short1: Short, ODBPRSPtr1: odbprs.ByReference): Short
  def cnc_rdprstrinfom(short1: Short, ODBPRSMPtr1: odbprsm.ByReference): Short
  def cnc_rstrseqsrch(short1: Short, long1: NativeLong, long2: NativeLong, short2: Short, short3: Short): Short
  def cnc_rstrseqsrch2(
      short1: Short,
      long1: NativeLong,
      long2: NativeLong,
      short2: Short,
      short3: Short,
      long3: NativeLong
  ): Short
  def cnc_rdopnlsgnl(short1: Short, short2: Short, IODBSGNLPtr1: iodbsgnl.ByReference): Short
  def cnc_wropnlsgnl(short1: Short, IODBSGNLPtr1: iodbsgnl.ByReference): Short
  def cnc_rdopnlgnrl(short1: Short, short2: Short, IODBGNRLPtr1: iodbgnrl.ByReference): Short
  def cnc_wropnlgnrl(short1: Short, IODBGNRLPtr1: iodbgnrl.ByReference): Short
  def cnc_rdopnlgnrl2(short1: Short, short2: Short, IODBGNRL2Ptr1: iodbgnrl2.ByReference): Short
  def cnc_wropnlgnrl2(short1: Short, IODBGNRL2Ptr1: iodbgnrl2.ByReference): Short
  def cnc_rdopnlgsname(short1: Short, short2: Short, IODBRDNAPtr1: iodbrdna.ByReference): Short
  def cnc_wropnlgsname(short1: Short, IODBRDNAPtr1: iodbrdna.ByReference): Short
  def cnc_rdopnlgsname2(short1: Short, short2: Short, IODBRDNA2Ptr1: iodbrdna2.ByReference): Short
  def cnc_wropnlgsname2(short1: Short, IODBRDNA2Ptr1: iodbrdna2.ByReference): Short
  def cnc_getdtailerr(short1: Short, ODBERRPtr1: odberr.ByReference): Short
  def cnc_getdtailerr2(short1: Short, ODBERRPtr1: odberr.ByReference): Short
  def cnc_rdparainfo(short1: Short, short2: Short, short3: Short, ODBPARAIFPtr1: odbparaif.ByReference): Short
  def cnc_rdsetinfo(short1: Short, short2: Short, short3: Short, ODBSETIFPtr1: odbsetif.ByReference): Short
  def cnc_rddiaginfo(short1: Short, short2: Short, short3: Short, ODBDIAGIFPtr1: odbdiagif.ByReference): Short
  def cnc_rdparainfo2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      ODBPARAIF2Ptr1: odbparaif2.ByReference
  ): Short
  def cnc_rdparainfo3(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      ODBPARAIF2Ptr1: odbparaif2.ByReference
  ): Short
  def cnc_rdsetinfo2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      ODBPARAIF2Ptr1: odbparaif2.ByReference
  ): Short
  def cnc_rddiaginfo2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer,
      ODBPARAIF2Ptr1: odbparaif2.ByReference
  ): Short
  def cnc_rdparanum(short1: Short, ODBPARANUMPtr1: odbparanum.ByReference): Short
  def cnc_rdsetnum(short1: Short, ODBSETNUMPtr1: odbsetnum.ByReference): Short
  def cnc_rddiagnum(short1: Short, ODBDIAGNUMPtr1: odbdiagnum.ByReference): Short
  def cnc_getfigure(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      shortPtr3: ShortBuffer
  ): Short
  def cnc_rdfrominfo(short1: Short, short2: Short, ODBFINFOPtr1: odbfinfo.ByReference): Short
  def cnc_fromsvstart(short1: Short, short2: Short, charPtr1: ByteBuffer, long1: NativeLong): Short
  def cnc_fromsave(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_fromsvend(short1: Short): Short
  def cnc_fromldstart(short1: Short, short2: Short, long1: NativeLong): Short
  def cnc_fromload(short1: Short, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_fromldend(short1: Short): Short
  def cnc_fromdelete(short1: Short, short2: Short, charPtr1: ByteBuffer, long1: NativeLong): Short
  def cnc_rdsraminfo(short1: Short, ODBSINFOPtr1: odbsinfo.ByReference): Short
  def cnc_srambkstart(short1: Short, charPtr1: ByteBuffer, long1: NativeLong): Short
  def cnc_srambackup(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_srambkend(short1: Short): Short
  def cnc_getfrominfo(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      ODBFINFORMPtr1: odbfinform.ByReference
  ): Short
  def cnc_fromgetstart(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_fromget(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_fromgetend(short1: Short): Short
  def cnc_fromputstart(short1: Short, short2: Short): Short
  def cnc_fromput(short1: Short, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_fromputend(short1: Short): Short
  def cnc_fromremove(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_getsraminfo(short1: Short, ODBSINFOPtr1: odbsinfo.ByReference): Short
  def cnc_sramgetstart(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_sramgetstart2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_sramget(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_sramget2(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_sramgetend(short1: Short): Short
  def cnc_sramgetend2(short1: Short): Short
  def cnc_sramputstart(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_sramputstart2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_sramput(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_sramput2(short1: Short, shortPtr1: ShortBuffer, voidPtr1: Pointer, longPtr1: NativeLongByReference): Short
  def cnc_sramputend(short1: Short): Short
  def cnc_sramputend2(short1: Short): Short
  def cnc_rdsramnum(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdsramaddr(short1: Short, shortPtr1: ShortBuffer, SRAMADDRPtr1: sramaddr.ByReference): Short
  def cnc_getlockstat(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_chgprotbit(short1: Short, short2: Short, charPtr1: ByteBuffer, long1: NativeLong): Short
  def cnc_dtsvftpget(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_dtsvftpput(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer): Short
  def cnc_dtsvftpstat(short1: Short): Short
  def cnc_dtsvrdpgdir(short1: Short, charPtr1: ByteBuffer, short2: Short, ODBDSDIRPtr1: odbdsdir.ByReference): Short
  def cnc_dtsvdelete(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvdownload(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvupload(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvcnclupdn(short1: Short): Short
  def cnc_dtsvupdnstat(short1: Short): Short
  def cnc_dtsvgetdncpg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvsetdncpg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvrdset(short1: Short, IODBDSSETPtr1: iodbdsset.ByReference): Short
  def cnc_dtsvwrset(short1: Short, IODBDSSETPtr1: iodbdsset.ByReference): Short
  def cnc_dtsvchkdsk(short1: Short): Short
  def cnc_dtsvhdformat(short1: Short): Short
  def cnc_dtsvsavecram(short1: Short): Short
  def cnc_dtsvrdcram(short1: Short, long1: NativeLong, longPtr1: NativeLongByReference, charPtr1: ByteBuffer): Short
  def cnc_dtsvmntinfo(short1: Short, ODBDSMNTPtr1: odbdsmnt.ByReference): Short
  def cnc_dtsvgetmode(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_dtsvsetmode(short1: Short, short2: Short): Short
  def cnc_dtsvrderrmsg(short1: Short, short2: Short, charPtr1: ByteBuffer): Short
  def cnc_dtsvwrfile(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer, short2: Short): Short
  def cnc_dtsvrdfile(short1: Short, charPtr1: ByteBuffer, charPtr2: ByteBuffer, short2: Short): Short
  def cnc_rdloopgain(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdcurrent(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdsrvspeed(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdsrvtsa(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdsrvtcmd(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdopmode(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdposerrs(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdposerrs2(short1: Short, ODBPSERPtr1: odbpser.ByReference): Short
  def cnc_rdposerrz(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdsynerrsy(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdsynerrrg(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdspdlalm(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdctrldi(short1: Short, ODBSPDIPtr1: odbspdi.ByReference): Short
  def cnc_rdctrldo(short1: Short, ODBSPDOPtr1: odbspdo.ByReference): Short
  def cnc_rdnspdl(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdsvfeedback(short1: Short, short2: Short, ODBSVFBACKPtr1: odbsvfback.ByReference): Short
  def cnc_rdfbusmem(
      short1: Short,
      short2: Short,
      short3: Short,
      long1: NativeLong,
      long2: NativeLong,
      voidPtr1: Pointer
  ): Short
  def cnc_wrfbusmem(
      short1: Short,
      short2: Short,
      short3: Short,
      long1: NativeLong,
      long2: NativeLong,
      voidPtr1: Pointer
  ): Short
  def cnc_rdwaveprm(short1: Short, IODBWAVEPtr1: iodbwave.ByReference): Short
  def cnc_wrwaveprm(short1: Short, IODBWAVEPtr1: iodbwave.ByReference): Short
  def cnc_rdwaveprm2(short1: Short, IODBWVPRMPtr1: iodbwvprm.ByReference): Short
  def cnc_wrwaveprm2(short1: Short, IODBWVPRMPtr1: iodbwvprm.ByReference): Short
  def cnc_rdwaveprm3(short1: Short, IODBWVPRM3Ptr1: iodbwvprm3.ByReference): Short
  def cnc_wrwaveprm3(short1: Short, IODBWVPRM3Ptr1: iodbwvprm3.ByReference): Short
  def cnc_wavestart(short1: Short): Short
  def cnc_wavestop(short1: Short): Short
  def cnc_wavestat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdwavedata(
      short1: Short,
      short2: Short,
      short3: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBWVDTPtr1: odbwvdt.ByReference
  ): Short
  def cnc_rdwavedata3(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBWVDT3Ptr1: odbwvdt3.ByReference
  ): Short
  def cnc_rdwavecount(short1: Short, short2: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdwavedata2(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBWVDT2Ptr1: odbwvdt2.ByReference
  ): Short
  def cnc_rdrmtwaveprm(short1: Short, IODBRMTPRMPtr1: iodbrmtprm.ByReference, short2: Short): Short
  def cnc_wrrmtwaveprm(short1: Short, IODBRMTPRMPtr1: iodbrmtprm.ByReference): Short
  def cnc_rmtwavestart(short1: Short): Short
  def cnc_rmtwavestop(short1: Short): Short
  def cnc_rmtwavestat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdrmtwavedt(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBRMTDTPtr1: odbrmtdt.ByReference
  ): Short
  def cnc_rdsavsigadr(short1: Short, IODBSIGADPtr1: iodbsigad.ByReference, short2: Short): Short
  def cnc_wrsavsigadr(short1: Short, IODBSIGADPtr1: iodbsigad.ByReference, shortPtr1: ShortBuffer): Short
  def cnc_rdsavsigdata(short1: Short, short2: Short, short3: Short, voidPtr1: Pointer, shortPtr1: ShortBuffer): Short
  def cnc_rdmgrpdata(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBMGRPPtr1: odbmgrp.ByReference): Short
  def cnc_wrmgrpdata(short1: Short, IDBMGRPPtr1: idbmgrp.ByReference): Short
  def cnc_rdexecmcode(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBEXEMPtr1: odbexem.ByReference): Short
  def cnc_rdrstrmcode(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBRSTRMPtr1: odbrstrm.ByReference): Short
  def cnc_rdproctime(short1: Short, ODBPTIMEPtr1: odbptime.ByReference): Short
  def cnc_rdproctime3(short1: Short, charPtr1: ByteBuffer, ODBPTIME3Ptr1: odbptime3.ByReference): Short
  def cnc_rdmdiprgstat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdprgdirtime(
      short1: Short,
      longPtr1: NativeLongByReference,
      shortPtr1: ShortBuffer,
      PRGDIRTMPtr1: prgdirtm.ByReference
  ): Short
  def cnc_rdprogdir2(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      shortPtr2: ShortBuffer,
      PRGDIR2Ptr1: prgdir2.ByReference
  ): Short
  def cnc_rdprogdir3(
      short1: Short,
      short2: Short,
      longPtr1: NativeLongByReference,
      shortPtr1: ShortBuffer,
      PRGDIR3Ptr1: prgdir3.ByReference
  ): Short
  def cnc_rdprogdir4(
      short1: Short,
      short2: Short,
      long1: NativeLong,
      shortPtr1: ShortBuffer,
      PRGDIR3Ptr1: prgdir3.ByReference
  ): Short
  def cnc_rdprogdir4_w(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      shortPtr1: ShortBuffer,
      PRGDIR3Ptr1: prgdir3.ByReference
  ): Short
  def cnc_rddncfname(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_wrdncfname(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdcomparam(short1: Short, IODBCPRMPtr1: iodbcprm.ByReference): Short
  def cnc_wrcomparam(short1: Short, IODBCPRMPtr1: iodbcprm.ByReference): Short
  def cnc_rdcomlogmsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdcomopemsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdrcvmsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdsndmsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_sendmessage(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_clrmsgbuff(short1: Short, short2: Short): Short
  def cnc_rdrcvstat(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdintchk(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBINTPtr1: iodbint.ByReference
  ): Short
  def cnc_wrintchk(short1: Short, short2: Short, IODBINTPtr1: iodbint.ByReference): Short
  def cnc_rdintinfo(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdwkcdshft(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_wrwkcdshft(short1: Short, short2: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_rdwkcdsfms(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_wrwkcdsfms(short1: Short, short2: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_rdwkcdshft2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBWCSFPtr1: iodbwcsf.ByReference
  ): Short
  def cnc_wrwkcdshft2(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_rdwkcdsfms2(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBWCSFPtr1: iodbwcsf.ByReference
  ): Short
  def cnc_wrwkcdsfms2(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_rdwkcdshft3(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBWCSFPtr1: iodbwcsf.ByReference
  ): Short
  def cnc_wrwkcdshft3(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_rdwkcdsfms3(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      IODBWCSFPtr1: iodbwcsf.ByReference
  ): Short
  def cnc_wrwkcdsfms3(short1: Short, short2: Short, short3: Short, IODBWCSFPtr1: iodbwcsf.ByReference): Short
  def cnc_stopomhis(short1: Short): Short
  def cnc_startomhis(short1: Short): Short
  def cnc_rdomhisinfo(short1: Short, ODBOMIFPtr1: odbomif.ByReference): Short
  def cnc_rdomhistry(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODBOMHISPtr1: odbomhis.ByReference): Short
  def cnc_clearomhis(short1: Short): Short
  def cnc_rdbtofsr(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBBTOPtr1: iodbbto.ByReference
  ): Short
  def cnc_wrbtofsr(short1: Short, short2: Short, IODBBTOPtr1: iodbbto.ByReference): Short
  def cnc_rdbtofsinfo(short1: Short, ODBBTLINFPtr1: odbbtlinf.ByReference): Short
  def cnc_rdbaxis(short1: Short, ODBBAXISPtr1: odbbaxis.ByReference): Short
  def cnc_rdsyssoft(short1: Short, ODBSYSSPtr1: odbsyss.ByReference): Short
  def cnc_rdsyssoft2(short1: Short, ODBSYSS2Ptr1: odbsyss2.ByReference): Short
  def cnc_rdmdlconfig(short1: Short, ODBMDLCPtr1: odbmdlc.ByReference): Short
  def cnc_rdmdlconfig2(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_rdpscdproc(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBPSCDPtr1: iodbpscd.ByReference): Short
  def cnc_wrpscdproc(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBPSCDPtr1: iodbpscd.ByReference): Short
  def cnc_rdpscdpirc(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBPIRCPtr1: iodbpirc.ByReference): Short
  def cnc_wrpscdpirc(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBPIRCPtr1: iodbpirc.ByReference): Short
  def cnc_rdpscdedge(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBEDGEPtr1: iodbedge.ByReference): Short
  def cnc_wrpscdedge(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBEDGEPtr1: iodbedge.ByReference): Short
  def cnc_rdpscdslop(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBSLOPPtr1: iodbslop.ByReference): Short
  def cnc_wrpscdslop(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBSLOPPtr1: iodbslop.ByReference): Short
  def cnc_rdlpwrdty(short1: Short, IODBLPWDTPtr1: iodblpwdt.ByReference): Short
  def cnc_wrlpwrdty(short1: Short, IODBLPWDTPtr1: iodblpwdt.ByReference): Short
  def cnc_rdlpwrdat(short1: Short, ODBLOPDTPtr1: odblopdt.ByReference): Short
  def cnc_rdlpwrcpst(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrlpwrcpst(short1: Short, short2: Short): Short
  def cnc_rdlagslt(short1: Short, IODBLAGSLPtr1: iodblagsl.ByReference): Short
  def cnc_wrlagslt(short1: Short, IODBLAGSLPtr1: iodblagsl.ByReference): Short
  def cnc_rdlagst(short1: Short, IODBLAGSTPtr1: iodblagst.ByReference): Short
  def cnc_wrlagst(short1: Short, IODBLAGSTPtr1: iodblagst.ByReference): Short
  def cnc_rdledgprc(short1: Short, IODBLEGPRPtr1: iodblegpr.ByReference): Short
  def cnc_wrledgprc(short1: Short, IODBLEGPRPtr1: iodblegpr.ByReference): Short
  def cnc_rdlprcprc(short1: Short, IODBLPCPRPtr1: iodblpcpr.ByReference): Short
  def cnc_wrlprcprc(short1: Short, IODBLPCPRPtr1: iodblpcpr.ByReference): Short
  def cnc_rdlcmddat(short1: Short, ODBLCMDTPtr1: iodblcmdt.ByReference): Short
  def cnc_rdldsplc(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrldsplc(short1: Short, short2: Short): Short
  def cnc_rdlerrz(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdlactnum(short1: Short, ODBLACTNPtr1: odblactn.ByReference): Short
  def cnc_rdlcmmt(short1: Short, ODBLCMMTPtr1: odblcmmt.ByReference): Short
  def cnc_rdlpwrslt(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrlpwrslt(short1: Short, short2: Short): Short
  def cnc_rdlpwrctrl(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrlpwrctrl(short1: Short, short2: Short): Short
  def cnc_rdpwofsthis(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBPWOFSTPtr1: odbpwofst.ByReference
  ): Short
  def cnc_rdmngtime(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      IODBMNGTIMEPtr1: iodbmngtime.ByReference
  ): Short
  def cnc_wrmngtime(short1: Short, long1: NativeLong, IODBMNGTIMEPtr1: iodbmngtime.ByReference): Short
  def cnc_rddischarge(short1: Short, ODBDISCHRGPtr1: odbdischrg.ByReference): Short
  def cnc_rddischrgalm(
      short1: Short,
      long1: NativeLong,
      longPtr1: NativeLongByReference,
      ODBDISCHRGALMPtr1: odbdischrgalm.ByReference
  ): Short
  def cnc_rdlppfbdt(
      short1: Short,
      IDBLPPFBFGPtr1: idblppfbfg.ByReference,
      shortPtr1: ShortBuffer,
      IODBLPPFBDTPtr1: iodblppfbdt.ByReference
  ): Short
  def cnc_wrlppfbdt(
      short1: Short,
      IDBLPPFBFGPtr1: idblppfbfg.ByReference,
      shortPtr1: ShortBuffer,
      IODBLPPFBDTPtr1: iodblppfbdt.ByReference
  ): Short
  def cnc_gettimer(short1: Short, IODBTIMERPtr1: iodbtimer.ByReference): Short
  def cnc_settimer(short1: Short, IODBTIMERPtr1: iodbtimer.ByReference): Short
  def cnc_rdtimer(short1: Short, short2: Short, IODBTIMEPtr1: iodbtime.ByReference): Short
  def cnc_wrtimer(short1: Short, short2: Short, IODBTIMEPtr1: iodbtime.ByReference): Short
  def cnc_rdtlctldata(short1: Short, IODBTLCTLPtr1: iodbtlctl.ByReference): Short
  def cnc_wrtlctldata(short1: Short, IODBTLCTLPtr1: iodbtlctl.ByReference): Short
  def cnc_rdtooldata(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLDTPtr1: iodbtldt.ByReference): Short
  def cnc_wrtooldata(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLDTPtr1: iodbtldt.ByReference): Short
  def cnc_rdmultitldt(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBMLTTLPtr1: iodbmlttl.ByReference): Short
  def cnc_wrmultitldt(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBMLTTLPtr1: iodbmlttl.ByReference): Short
  def cnc_rdmtapdata(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBMTAPPtr1: iodbmtap.ByReference): Short
  def cnc_wrmtapdata(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBMTAPPtr1: iodbmtap.ByReference): Short
  def cnc_rdmultipieceno(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_rdtoolinfo(short1: Short, ODBPTLINFPtr1: odbptlinf.ByReference): Short
  def cnc_rdsafetyzone(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBSAFEPtr1: iodbsafe.ByReference): Short
  def cnc_wrsafetyzone(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBSAFEPtr1: iodbsafe.ByReference): Short
  def cnc_rdtoolzone(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLZNPtr1: iodbtlzn.ByReference): Short
  def cnc_wrtoolzone(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBTLZNPtr1: iodbtlzn.ByReference): Short
  def cnc_rdacttlzone(short1: Short, ODBACTTLZNPtr1: odbacttlzn.ByReference): Short
  def cnc_rdsetzone(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrsetzone(short1: Short, short2: Short): Short
  def cnc_rdbrstrinfo(short1: Short, ODBBRSPtr1: odbbrs.ByReference): Short
  def cnc_rdmenuswitch(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_wrmenuswitch(short1: Short, short2: Short, short3: Short): Short
  def cnc_rdradofs(short1: Short, ODBROFSPtr1: odbrofs.ByReference): Short
  def cnc_rdlenofs(short1: Short, ODBLOFSPtr1: odblofs.ByReference): Short
  def cnc_rdfixcycle(short1: Short, ODBFIXPtr1: odbfix.ByReference): Short
  def cnc_rdcdrotate(short1: Short, ODBROTPtr1: odbrot.ByReference): Short
  def cnc_rd3dcdcnv(short1: Short, ODB3DCDPtr1: odb3dcd.ByReference): Short
  def cnc_rdmirimage(short1: Short, ODBMIRPtr1: odbmir.ByReference): Short
  def cnc_rdscaling(short1: Short, ODBSCLPtr1: odbscl.ByReference): Short
  def cnc_rd3dtofs(short1: Short, ODB3DTOPtr1: odb3dto.ByReference): Short
  def cnc_rdposofs(short1: Short, ODBPOFSPtr1: odbpofs.ByReference): Short
  def cnc_rdhpccset(short1: Short, IODBHPSTPtr1: iodbhpst.ByReference): Short
  def cnc_wrhpccset(short1: Short, IODBHPSTPtr1: iodbhpst.ByReference): Short
  def cnc_hpccatset(short1: Short): Short
  def cnc_rdhpcctupr(short1: Short, IODBHPPRPtr1: iodbhppr.ByReference): Short
  def cnc_wrhpcctupr(short1: Short, IODBHPPRPtr1: iodbhppr.ByReference): Short
  def cnc_rdhpcctuac(short1: Short, IODBHPACPtr1: iodbhpac.ByReference): Short
  def cnc_wrhpcctuac(short1: Short, IODBHPACPtr1: iodbhpac.ByReference): Short
  def cnc_hpccattune(short1: Short, short2: Short, shortPtr1: ShortBuffer): Short
  def cnc_hpccactfine(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_hpccselfine(short1: Short, short2: Short): Short
  def cnc_rdfixoffs(short1: Short, short2: Short, short3: Short, ODBFOFSPtr1: odbfofs.ByReference): Short
  def cnc_wrfixoffs(short1: Short, short2: Short, short3: Short, ODBFOFSPtr1: odbfofs.ByReference): Short
  def cnc_rdactfixofs(short1: Short, short2: Short, IODBZOFSPtr1: iodbzofs.ByReference): Short
  def cnc_rdfixofs(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBZORPtr1: iodbzor.ByReference
  ): Short
  def cnc_wrfixofs(short1: Short, short2: Short, IODBZORPtr1: iodbzor.ByReference): Short
  def cnc_rdactdofs(short1: Short, short2: Short, IODBZOFSPtr1: iodbzofs.ByReference): Short
  def cnc_rddofs(
      short1: Short,
      short2: Short,
      short3: Short,
      short4: Short,
      short5: Short,
      IODBZORPtr1: iodbzor.ByReference
  ): Short
  def cnc_wrdofs(short1: Short, short2: Short, IODBZORPtr1: iodbzor.ByReference): Short
  def cnc_cdautoset(short1: Short, short2: Short, short3: Short): Short
  def cnc_rdcdslctprm(short1: Short, short2: Short, shortPtr1: ShortBuffer, IODBCTPRPtr1: iodbctpr.ByReference): Short
  def cnc_rdcdslctprmm(
      short1: Short,
      short2: Short,
      shortPtr1: ShortBuffer,
      IODBCTPRMPtr1: iodbctprm.ByReference
  ): Short
  def cnc_rdjogmdi(short1: Short, code: odbjogcmd): Short
  def cnc_wrjogmdi(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_wrjogmdiclr(short1: Short): Short
  def cnc_rd3dtooltip(short1: Short, ODB3DHDLPtr1: odb3dhdl.ByReference): Short
  def cnc_rd5dtooltip(short1: Short, shortPtr1: ShortBuffer, ODB5DHDLPtr1: odb5dhdl.ByReference): Short
  def cnc_rd5dmacmov(short1: Short, shortPtr1: ShortBuffer, ODB5DHDLPtr1: odb5dhdl.ByReference): Short
  def cnc_rd5dpulse(short1: Short, short2: Short, shortPtr1: ShortBuffer, ODB5DPLSPtr1: odb5dpls.ByReference): Short
  def cnc_clr5dplsmov(short1: Short, short2: Short): Short
  def cnc_rd3dpulse(short1: Short, ODB3DPLSPtr1: odb3dpls.ByReference): Short
  def cnc_rd3dmovrlap(short1: Short, ODB3DHDLPtr1: odb3dhdl.ByReference): Short
  def cnc_rd3dofschg(short1: Short, longPtr1: NativeLongByReference): Short
  def cnc_clr3dplsmov(short1: Short, short2: Short): Short
  def cnc_start(short1: Short): Short
  def cnc_reset(short1: Short): Short
  def cnc_reset2(short1: Short): Short
  def cnc_dispoptmsg(short1: Short, charPtr1: ByteBuffer): Short
  def cnc_optmsgans(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_getcncmodel(short1: Short, shortPtr1: ShortBuffer): Short
  def cnc_rdaxisname(short1: Short, shortPtr1: ShortBuffer, ODBAXISNAMEPtr1: odbaxisname.ByReference): Short
  def cnc_rdspdlname(short1: Short, shortPtr1: ShortBuffer, ODBSPDLNAMEPtr1: odbspdlname.ByReference): Short
  def cnc_rdspdlnamem(short1: Short, shortPtr1: ShortBuffer, ODBSPDLNAMEPtr1: odbspdlname.ByReference): Short
  def cnc_startupprocess(level: NativeLong, filename: String): Short

  def pmc_rdpmcrng(
      handle: Short,
      adr_type: Short,
      data_type: Short,
      s_number: Short,
      e_number: Short,
      length: Short,
      buf: iodbpmc.ByReference
  ): Short
}
