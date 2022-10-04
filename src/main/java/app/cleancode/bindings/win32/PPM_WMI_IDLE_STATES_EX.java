// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PPM_WMI_IDLE_STATES_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_LONG$LAYOUT.withName("TargetState"),
        Constants$root.C_LONG$LAYOUT.withName("OldState"),
        Constants$root.C_POINTER$LAYOUT.withName("TargetProcessors"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Latency"),
            Constants$root.C_LONG$LAYOUT.withName("Power"),
            Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
            Constants$root.C_CHAR$LAYOUT.withName("PromotePercent"),
            Constants$root.C_CHAR$LAYOUT.withName("DemotePercent"),
            Constants$root.C_CHAR$LAYOUT.withName("StateType"),
            Constants$root.C_CHAR$LAYOUT.withName("Reserved"),
            Constants$root.C_LONG$LAYOUT.withName("StateFlags"),
            Constants$root.C_LONG$LAYOUT.withName("Context"),
            Constants$root.C_LONG$LAYOUT.withName("IdleHandler"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved1")
        )).withName("State")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_WMI_IDLE_STATES_EX.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return PPM_WMI_IDLE_STATES_EX.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATES_EX.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATES_EX.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATES_EX.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATES_EX.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return PPM_WMI_IDLE_STATES_EX.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATES_EX.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATES_EX.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATES_EX.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATES_EX.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetState"));
    public static VarHandle TargetState$VH() {
        return PPM_WMI_IDLE_STATES_EX.TargetState$VH;
    }
    public static int TargetState$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATES_EX.TargetState$VH.get(seg);
    }
    public static void TargetState$set( MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATES_EX.TargetState$VH.set(seg, x);
    }
    public static int TargetState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATES_EX.TargetState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATES_EX.TargetState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OldState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OldState"));
    public static VarHandle OldState$VH() {
        return PPM_WMI_IDLE_STATES_EX.OldState$VH;
    }
    public static int OldState$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATES_EX.OldState$VH.get(seg);
    }
    public static void OldState$set( MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATES_EX.OldState$VH.set(seg, x);
    }
    public static int OldState$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATES_EX.OldState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OldState$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATES_EX.OldState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetProcessors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetProcessors"));
    public static VarHandle TargetProcessors$VH() {
        return PPM_WMI_IDLE_STATES_EX.TargetProcessors$VH;
    }
    public static MemoryAddress TargetProcessors$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PPM_WMI_IDLE_STATES_EX.TargetProcessors$VH.get(seg);
    }
    public static void TargetProcessors$set( MemorySegment seg, MemoryAddress x) {
        PPM_WMI_IDLE_STATES_EX.TargetProcessors$VH.set(seg, x);
    }
    public static MemoryAddress TargetProcessors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PPM_WMI_IDLE_STATES_EX.TargetProcessors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetProcessors$set(MemorySegment seg, long index, MemoryAddress x) {
        PPM_WMI_IDLE_STATES_EX.TargetProcessors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment State$slice(MemorySegment seg) {
        return seg.asSlice(24, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


