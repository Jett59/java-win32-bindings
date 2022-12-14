// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PPM_WMI_LEGACY_PERFSTATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Frequency"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("PercentFrequency")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_WMI_LEGACY_PERFSTATE.$struct$LAYOUT;
    }
    static final VarHandle Frequency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Frequency"));
    public static VarHandle Frequency$VH() {
        return PPM_WMI_LEGACY_PERFSTATE.Frequency$VH;
    }
    public static int Frequency$get(MemorySegment seg) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.Frequency$VH.get(seg);
    }
    public static void Frequency$set( MemorySegment seg, int x) {
        PPM_WMI_LEGACY_PERFSTATE.Frequency$VH.set(seg, x);
    }
    public static int Frequency$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.Frequency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Frequency$set(MemorySegment seg, long index, int x) {
        PPM_WMI_LEGACY_PERFSTATE.Frequency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return PPM_WMI_LEGACY_PERFSTATE.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        PPM_WMI_LEGACY_PERFSTATE.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        PPM_WMI_LEGACY_PERFSTATE.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PercentFrequency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PercentFrequency"));
    public static VarHandle PercentFrequency$VH() {
        return PPM_WMI_LEGACY_PERFSTATE.PercentFrequency$VH;
    }
    public static int PercentFrequency$get(MemorySegment seg) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.PercentFrequency$VH.get(seg);
    }
    public static void PercentFrequency$set( MemorySegment seg, int x) {
        PPM_WMI_LEGACY_PERFSTATE.PercentFrequency$VH.set(seg, x);
    }
    public static int PercentFrequency$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_LEGACY_PERFSTATE.PercentFrequency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PercentFrequency$set(MemorySegment seg, long index, int x) {
        PPM_WMI_LEGACY_PERFSTATE.PercentFrequency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


