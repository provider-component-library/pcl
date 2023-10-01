package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I4Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b7Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b12Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b22Provider;
    @Hard
    private final Provider<Integer> b26Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b34Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b36Provider;
    @Hard
    private final Provider<Integer> b37Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> i10Provider;
    @Hard
    private final Provider<Integer> i17Provider;
    @Hard
    private final Provider<Integer> i22Provider;
    @Hard
    private final Provider<Integer> i24Provider;
    @Hard
    private final Provider<Integer> i26Provider;
    @Hard
    private final Provider<Integer> i27Provider;
    @Hard
    private final Provider<Integer> i31Provider;
    @Hard
    private final Provider<Integer> i33Provider;
    @Hard
    private final Provider<Integer> i36Provider;
    @Hard
    private final Provider<Integer> i38Provider;
    @Hard
    private final Provider<Integer> i39Provider;
    @Hard
    private final Provider<Integer> i40Provider;
    @Hard
    private final Provider<Integer> i44Provider;
    @Hard
    private final Provider<Integer> i47Provider;
    @Hard
    private final Provider<Integer> i49Provider;
    @Hard
    private final Provider<Integer> i52Provider;
    @Hard
    private final Provider<Integer> i54Provider;
    @Hard
    private final Provider<Integer> i57Provider;
    @Hard
    private final Provider<Integer> i61Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i65Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i82Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i103Provider;
    @Hard
    private final Provider<Integer> i104Provider;
    @Hard
    private final Provider<Integer> i105Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i109Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i131Provider;
    @Hard
    private final Provider<Integer> i133Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i143Provider;
    @Hard
    private final Provider<Integer> i145Provider;
    @Hard
    private final Provider<Integer> i146Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i165Provider;
    @Hard
    private final Provider<Integer> i168Provider;
    @Hard
    private final Provider<Integer> i172Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i175Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i197Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b5Provider.get(request);
		int p5Val = b7Provider.get(request);
		int p6Val = b8Provider.get(request);
		int p7Val = b9Provider.get(request);
		int p8Val = b12Provider.get(request);
		int p9Val = b16Provider.get(request);
		int p10Val = b18Provider.get(request);
		int p11Val = b22Provider.get(request);
		int p12Val = b26Provider.get(request);
		int p13Val = b27Provider.get(request);
		int p14Val = b29Provider.get(request);
		int p15Val = b32Provider.get(request);
		int p16Val = b34Provider.get(request);
		int p17Val = b35Provider.get(request);
		int p18Val = b36Provider.get(request);
		int p19Val = b37Provider.get(request);
		int p20Val = b44Provider.get(request);
		int p21Val = b46Provider.get(request);
		int p22Val = b47Provider.get(request);
		int p23Val = b48Provider.get(request);
		int p24Val = i10Provider.get(request);
		int p25Val = i17Provider.get(request);
		int p26Val = i22Provider.get(request);
		int p27Val = i24Provider.get(request);
		int p28Val = i26Provider.get(request);
		int p29Val = i27Provider.get(request);
		int p30Val = i31Provider.get(request);
		int p31Val = i33Provider.get(request);
		int p32Val = i36Provider.get(request);
		int p33Val = i38Provider.get(request);
		int p34Val = i39Provider.get(request);
		int p35Val = i40Provider.get(request);
		int p36Val = i44Provider.get(request);
		int p37Val = i47Provider.get(request);
		int p38Val = i49Provider.get(request);
		int p39Val = i52Provider.get(request);
		int p40Val = i54Provider.get(request);
		int p41Val = i57Provider.get(request);
		int p42Val = i61Provider.get(request);
		int p43Val = i62Provider.get(request);
		int p44Val = i65Provider.get(request);
		int p45Val = i68Provider.get(request);
		int p46Val = i71Provider.get(request);
		int p47Val = i72Provider.get(request);
		int p48Val = i79Provider.get(request);
		int p49Val = i82Provider.get(request);
		int p50Val = i85Provider.get(request);
		int p51Val = i92Provider.get(request);
		int p52Val = i101Provider.get(request);
		int p53Val = i103Provider.get(request);
		int p54Val = i104Provider.get(request);
		int p55Val = i105Provider.get(request);
		int p56Val = i108Provider.get(request);
		int p57Val = i109Provider.get(request);
		int p58Val = i110Provider.get(request);
		int p59Val = i117Provider.get(request);
		int p60Val = i130Provider.get(request);
		int p61Val = i131Provider.get(request);
		
        try {
            Thread.sleep(74);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p62Val = i133Provider.get(request);
		int p63Val = i137Provider.get(request);
		int p64Val = i139Provider.get(request);
		int p65Val = i143Provider.get(request);
		int p66Val = i145Provider.get(request);
		int p67Val = i146Provider.get(request);
		int p68Val = i148Provider.get(request);
		int p69Val = i150Provider.get(request);
		int p70Val = i152Provider.get(request);
		
        try {
            Thread.sleep(64);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p71Val = i165Provider.get(request);
		int p72Val = i168Provider.get(request);
		int p73Val = i172Provider.get(request);
		int p74Val = i173Provider.get(request);
		int p75Val = i175Provider.get(request);
		int p76Val = i176Provider.get(request);
		int p77Val = i184Provider.get(request);
		int p78Val = i186Provider.get(request);
		int p79Val = i188Provider.get(request);
		
        try {
            Thread.sleep(47);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p80Val = i189Provider.get(request);
		int p81Val = i197Provider.get(request);
		int p82Val = i199Provider.get(request);

        return p1Val +
				p2Val +
				p3Val +
				p4Val +
				p5Val +
				p6Val +
				p7Val +
				p8Val +
				p9Val +
				p10Val +
				p11Val +
				p12Val +
				p13Val +
				p14Val +
				p15Val +
				p16Val +
				p17Val +
				p18Val +
				p19Val +
				p20Val +
				p21Val +
				p22Val +
				p23Val +
				p24Val +
				p25Val +
				p26Val +
				p27Val +
				p28Val +
				p29Val +
				p30Val +
				p31Val +
				p32Val +
				p33Val +
				p34Val +
				p35Val +
				p36Val +
				p37Val +
				p38Val +
				p39Val +
				p40Val +
				p41Val +
				p42Val +
				p43Val +
				p44Val +
				p45Val +
				p46Val +
				p47Val +
				p48Val +
				p49Val +
				p50Val +
				p51Val +
				p52Val +
				p53Val +
				p54Val +
				p55Val +
				p56Val +
				p57Val +
				p58Val +
				p59Val +
				p60Val +
				p61Val +
				p62Val +
				p63Val +
				p64Val +
				p65Val +
				p66Val +
				p67Val +
				p68Val +
				p69Val +
				p70Val +
				p71Val +
				p72Val +
				p73Val +
				p74Val +
				p75Val +
				p76Val +
				p77Val +
				p78Val +
				p79Val +
				p80Val +
				p81Val +
				p82Val;
    }
}
