// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagNEWTEXTMETRICEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("tmHeight"),
            Constants$root.C_LONG$LAYOUT.withName("tmAscent"),
            Constants$root.C_LONG$LAYOUT.withName("tmDescent"),
            Constants$root.C_LONG$LAYOUT.withName("tmInternalLeading"),
            Constants$root.C_LONG$LAYOUT.withName("tmExternalLeading"),
            Constants$root.C_LONG$LAYOUT.withName("tmAveCharWidth"),
            Constants$root.C_LONG$LAYOUT.withName("tmMaxCharWidth"),
            Constants$root.C_LONG$LAYOUT.withName("tmWeight"),
            Constants$root.C_LONG$LAYOUT.withName("tmOverhang"),
            Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectX"),
            Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectY"),
            Constants$root.C_CHAR$LAYOUT.withName("tmFirstChar"),
            Constants$root.C_CHAR$LAYOUT.withName("tmLastChar"),
            Constants$root.C_CHAR$LAYOUT.withName("tmDefaultChar"),
            Constants$root.C_CHAR$LAYOUT.withName("tmBreakChar"),
            Constants$root.C_CHAR$LAYOUT.withName("tmItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("tmUnderlined"),
            Constants$root.C_CHAR$LAYOUT.withName("tmStruckOut"),
            Constants$root.C_CHAR$LAYOUT.withName("tmPitchAndFamily"),
            Constants$root.C_CHAR$LAYOUT.withName("tmCharSet"),
            MemoryLayout.paddingLayout(24),
            Constants$root.C_LONG$LAYOUT.withName("ntmFlags"),
            Constants$root.C_LONG$LAYOUT.withName("ntmSizeEM"),
            Constants$root.C_LONG$LAYOUT.withName("ntmCellHeight"),
            Constants$root.C_LONG$LAYOUT.withName("ntmAvgWidth")
        ).withName("ntmTm"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Constants$root.C_LONG$LAYOUT).withName("fsUsb"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("fsCsb")
        ).withName("ntmFontSig")
    ).withName("tagNEWTEXTMETRICEXA");
    public static MemoryLayout $LAYOUT() {
        return tagNEWTEXTMETRICEXA.$struct$LAYOUT;
    }
    public static MemorySegment ntmTm$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static MemorySegment ntmFontSig$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


