// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSETDIBITSTODEVICE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("xDest"),
        Constants$root.C_LONG$LAYOUT.withName("yDest"),
        Constants$root.C_LONG$LAYOUT.withName("xSrc"),
        Constants$root.C_LONG$LAYOUT.withName("ySrc"),
        Constants$root.C_LONG$LAYOUT.withName("cxSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cySrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmiSrc"),
        Constants$root.C_LONG$LAYOUT.withName("offBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("cbBitsSrc"),
        Constants$root.C_LONG$LAYOUT.withName("iUsageSrc"),
        Constants$root.C_LONG$LAYOUT.withName("iStartScan"),
        Constants$root.C_LONG$LAYOUT.withName("cScans")
    ).withName("tagEMRSETDIBITSTODEVICE");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETDIBITSTODEVICE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle xDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xDest"));
    public static VarHandle xDest$VH() {
        return tagEMRSETDIBITSTODEVICE.xDest$VH;
    }
    public static int xDest$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.xDest$VH.get(seg);
    }
    public static void xDest$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.xDest$VH.set(seg, x);
    }
    public static int xDest$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.xDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xDest$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.xDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yDest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yDest"));
    public static VarHandle yDest$VH() {
        return tagEMRSETDIBITSTODEVICE.yDest$VH;
    }
    public static int yDest$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.yDest$VH.get(seg);
    }
    public static void yDest$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.yDest$VH.set(seg, x);
    }
    public static int yDest$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.yDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yDest$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.yDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xSrc"));
    public static VarHandle xSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.xSrc$VH;
    }
    public static int xSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.xSrc$VH.get(seg);
    }
    public static void xSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.xSrc$VH.set(seg, x);
    }
    public static int xSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.xSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.xSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ySrc"));
    public static VarHandle ySrc$VH() {
        return tagEMRSETDIBITSTODEVICE.ySrc$VH;
    }
    public static int ySrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.ySrc$VH.get(seg);
    }
    public static void ySrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.ySrc$VH.set(seg, x);
    }
    public static int ySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.ySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ySrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.ySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cxSrc"));
    public static VarHandle cxSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.cxSrc$VH;
    }
    public static int cxSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.cxSrc$VH.get(seg);
    }
    public static void cxSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.cxSrc$VH.set(seg, x);
    }
    public static int cxSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.cxSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.cxSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cySrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cySrc"));
    public static VarHandle cySrc$VH() {
        return tagEMRSETDIBITSTODEVICE.cySrc$VH;
    }
    public static int cySrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.cySrc$VH.get(seg);
    }
    public static void cySrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.cySrc$VH.set(seg, x);
    }
    public static int cySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.cySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cySrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.cySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmiSrc"));
    public static VarHandle offBmiSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.offBmiSrc$VH;
    }
    public static int offBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.offBmiSrc$VH.get(seg);
    }
    public static void offBmiSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.offBmiSrc$VH.set(seg, x);
    }
    public static int offBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.offBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.offBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    public static VarHandle cbBmiSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.cbBmiSrc$VH;
    }
    public static int cbBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.cbBmiSrc$VH.get(seg);
    }
    public static void cbBmiSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.cbBmiSrc$VH.set(seg, x);
    }
    public static int cbBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.cbBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.cbBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBitsSrc"));
    public static VarHandle offBitsSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.offBitsSrc$VH;
    }
    public static int offBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.offBitsSrc$VH.get(seg);
    }
    public static void offBitsSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.offBitsSrc$VH.set(seg, x);
    }
    public static int offBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.offBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.offBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    public static VarHandle cbBitsSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.cbBitsSrc$VH;
    }
    public static int cbBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.cbBitsSrc$VH.get(seg);
    }
    public static void cbBitsSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.cbBitsSrc$VH.set(seg, x);
    }
    public static int cbBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.cbBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.cbBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageSrc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsageSrc"));
    public static VarHandle iUsageSrc$VH() {
        return tagEMRSETDIBITSTODEVICE.iUsageSrc$VH;
    }
    public static int iUsageSrc$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.iUsageSrc$VH.get(seg);
    }
    public static void iUsageSrc$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.iUsageSrc$VH.set(seg, x);
    }
    public static int iUsageSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.iUsageSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageSrc$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.iUsageSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iStartScan$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iStartScan"));
    public static VarHandle iStartScan$VH() {
        return tagEMRSETDIBITSTODEVICE.iStartScan$VH;
    }
    public static int iStartScan$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.iStartScan$VH.get(seg);
    }
    public static void iStartScan$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.iStartScan$VH.set(seg, x);
    }
    public static int iStartScan$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.iStartScan$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iStartScan$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.iStartScan$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cScans$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cScans"));
    public static VarHandle cScans$VH() {
        return tagEMRSETDIBITSTODEVICE.cScans$VH;
    }
    public static int cScans$get(MemorySegment seg) {
        return (int)tagEMRSETDIBITSTODEVICE.cScans$VH.get(seg);
    }
    public static void cScans$set( MemorySegment seg, int x) {
        tagEMRSETDIBITSTODEVICE.cScans$VH.set(seg, x);
    }
    public static int cScans$get(MemorySegment seg, long index) {
        return (int)tagEMRSETDIBITSTODEVICE.cScans$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cScans$set(MemorySegment seg, long index, int x) {
        tagEMRSETDIBITSTODEVICE.cScans$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

