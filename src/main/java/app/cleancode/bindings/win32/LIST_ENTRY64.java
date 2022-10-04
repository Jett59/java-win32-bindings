// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class LIST_ENTRY64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Flink"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Blink")
    ).withName("LIST_ENTRY64");
    public static MemoryLayout $LAYOUT() {
        return LIST_ENTRY64.$struct$LAYOUT;
    }
    static final VarHandle Flink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flink"));
    public static VarHandle Flink$VH() {
        return LIST_ENTRY64.Flink$VH;
    }
    public static long Flink$get(MemorySegment seg) {
        return (long)LIST_ENTRY64.Flink$VH.get(seg);
    }
    public static void Flink$set( MemorySegment seg, long x) {
        LIST_ENTRY64.Flink$VH.set(seg, x);
    }
    public static long Flink$get(MemorySegment seg, long index) {
        return (long)LIST_ENTRY64.Flink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, long x) {
        LIST_ENTRY64.Flink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blink"));
    public static VarHandle Blink$VH() {
        return LIST_ENTRY64.Blink$VH;
    }
    public static long Blink$get(MemorySegment seg) {
        return (long)LIST_ENTRY64.Blink$VH.get(seg);
    }
    public static void Blink$set( MemorySegment seg, long x) {
        LIST_ENTRY64.Blink$VH.set(seg, x);
    }
    public static long Blink$get(MemorySegment seg, long index) {
        return (long)LIST_ENTRY64.Blink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, long x) {
        LIST_ENTRY64.Blink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

