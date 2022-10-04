// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMREXTESCAPE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("iEscape"),
        Constants$root.C_LONG$LAYOUT.withName("cbEscData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("EscData"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMREXTESCAPE");
    public static MemoryLayout $LAYOUT() {
        return tagEMREXTESCAPE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle iEscape$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iEscape"));
    public static VarHandle iEscape$VH() {
        return tagEMREXTESCAPE.iEscape$VH;
    }
    public static int iEscape$get(MemorySegment seg) {
        return (int)tagEMREXTESCAPE.iEscape$VH.get(seg);
    }
    public static void iEscape$set( MemorySegment seg, int x) {
        tagEMREXTESCAPE.iEscape$VH.set(seg, x);
    }
    public static int iEscape$get(MemorySegment seg, long index) {
        return (int)tagEMREXTESCAPE.iEscape$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iEscape$set(MemorySegment seg, long index, int x) {
        tagEMREXTESCAPE.iEscape$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbEscData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbEscData"));
    public static VarHandle cbEscData$VH() {
        return tagEMREXTESCAPE.cbEscData$VH;
    }
    public static int cbEscData$get(MemorySegment seg) {
        return (int)tagEMREXTESCAPE.cbEscData$VH.get(seg);
    }
    public static void cbEscData$set( MemorySegment seg, int x) {
        tagEMREXTESCAPE.cbEscData$VH.set(seg, x);
    }
    public static int cbEscData$get(MemorySegment seg, long index) {
        return (int)tagEMREXTESCAPE.cbEscData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbEscData$set(MemorySegment seg, long index, int x) {
        tagEMREXTESCAPE.cbEscData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment EscData$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


