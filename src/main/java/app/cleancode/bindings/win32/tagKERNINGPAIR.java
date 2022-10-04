// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagKERNINGPAIR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wFirst"),
        Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
        Constants$root.C_LONG$LAYOUT.withName("iKernAmount")
    ).withName("tagKERNINGPAIR");
    public static MemoryLayout $LAYOUT() {
        return tagKERNINGPAIR.$struct$LAYOUT;
    }
    static final VarHandle wFirst$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFirst"));
    public static VarHandle wFirst$VH() {
        return tagKERNINGPAIR.wFirst$VH;
    }
    public static short wFirst$get(MemorySegment seg) {
        return (short)tagKERNINGPAIR.wFirst$VH.get(seg);
    }
    public static void wFirst$set( MemorySegment seg, short x) {
        tagKERNINGPAIR.wFirst$VH.set(seg, x);
    }
    public static short wFirst$get(MemorySegment seg, long index) {
        return (short)tagKERNINGPAIR.wFirst$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFirst$set(MemorySegment seg, long index, short x) {
        tagKERNINGPAIR.wFirst$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSecond$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSecond"));
    public static VarHandle wSecond$VH() {
        return tagKERNINGPAIR.wSecond$VH;
    }
    public static short wSecond$get(MemorySegment seg) {
        return (short)tagKERNINGPAIR.wSecond$VH.get(seg);
    }
    public static void wSecond$set( MemorySegment seg, short x) {
        tagKERNINGPAIR.wSecond$VH.set(seg, x);
    }
    public static short wSecond$get(MemorySegment seg, long index) {
        return (short)tagKERNINGPAIR.wSecond$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSecond$set(MemorySegment seg, long index, short x) {
        tagKERNINGPAIR.wSecond$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iKernAmount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iKernAmount"));
    public static VarHandle iKernAmount$VH() {
        return tagKERNINGPAIR.iKernAmount$VH;
    }
    public static int iKernAmount$get(MemorySegment seg) {
        return (int)tagKERNINGPAIR.iKernAmount$VH.get(seg);
    }
    public static void iKernAmount$set( MemorySegment seg, int x) {
        tagKERNINGPAIR.iKernAmount$VH.set(seg, x);
    }
    public static int iKernAmount$get(MemorySegment seg, long index) {
        return (int)tagKERNINGPAIR.iKernAmount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iKernAmount$set(MemorySegment seg, long index, int x) {
        tagKERNINGPAIR.iKernAmount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

