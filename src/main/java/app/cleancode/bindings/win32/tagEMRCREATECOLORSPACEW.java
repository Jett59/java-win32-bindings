// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRCREATECOLORSPACEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihCS"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lcsSignature"),
            Constants$root.C_LONG$LAYOUT.withName("lcsVersion"),
            Constants$root.C_LONG$LAYOUT.withName("lcsSize"),
            Constants$root.C_LONG$LAYOUT.withName("lcsCSType"),
            Constants$root.C_LONG$LAYOUT.withName("lcsIntent"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
                ).withName("ciexyzRed"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
                ).withName("ciexyzGreen"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                    Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
                ).withName("ciexyzBlue")
            ).withName("lcsEndpoints"),
            Constants$root.C_LONG$LAYOUT.withName("lcsGammaRed"),
            Constants$root.C_LONG$LAYOUT.withName("lcsGammaGreen"),
            Constants$root.C_LONG$LAYOUT.withName("lcsGammaBlue"),
            MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("lcsFilename")
        ).withName("lcs"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMRCREATECOLORSPACEW");
    public static MemoryLayout $LAYOUT() {
        return tagEMRCREATECOLORSPACEW.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihCS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihCS"));
    public static VarHandle ihCS$VH() {
        return tagEMRCREATECOLORSPACEW.ihCS$VH;
    }
    public static int ihCS$get(MemorySegment seg) {
        return (int)tagEMRCREATECOLORSPACEW.ihCS$VH.get(seg);
    }
    public static void ihCS$set( MemorySegment seg, int x) {
        tagEMRCREATECOLORSPACEW.ihCS$VH.set(seg, x);
    }
    public static int ihCS$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATECOLORSPACEW.ihCS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihCS$set(MemorySegment seg, long index, int x) {
        tagEMRCREATECOLORSPACEW.ihCS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lcs$slice(MemorySegment seg) {
        return seg.asSlice(12, 588);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagEMRCREATECOLORSPACEW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagEMRCREATECOLORSPACEW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagEMRCREATECOLORSPACEW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATECOLORSPACEW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagEMRCREATECOLORSPACEW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagEMRCREATECOLORSPACEW.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagEMRCREATECOLORSPACEW.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagEMRCREATECOLORSPACEW.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATECOLORSPACEW.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagEMRCREATECOLORSPACEW.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(608, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

