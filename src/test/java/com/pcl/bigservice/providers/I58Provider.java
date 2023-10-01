package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I58Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b5Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b8Provider;
    @Hard
    private final Provider<Integer> b9Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b17Provider;
    @Hard
    private final Provider<Integer> b20Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b25Provider;
    @Hard
    private final Provider<Integer> b31Provider;
    @Hard
    private final Provider<Integer> b32Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b44Provider;
    @Hard
    private final Provider<Integer> b46Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> i59Provider;
    @Hard
    private final Provider<Integer> i62Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i70Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i76Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i79Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i87Provider;
    @Hard
    private final Provider<Integer> i89Provider;
    @Hard
    private final Provider<Integer> i90Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i94Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i97Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i101Provider;
    @Hard
    private final Provider<Integer> i106Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i108Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i116Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i121Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i136Provider;
    @Hard
    private final Provider<Integer> i139Provider;
    @Hard
    private final Provider<Integer> i140Provider;
    @Hard
    private final Provider<Integer> i142Provider;
    @Hard
    private final Provider<Integer> i148Provider;
    @Hard
    private final Provider<Integer> i150Provider;
    @Hard
    private final Provider<Integer> i151Provider;
    @Hard
    private final Provider<Integer> i163Provider;
    @Hard
    private final Provider<Integer> i169Provider;
    @Hard
    private final Provider<Integer> i173Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i179Provider;
    @Hard
    private final Provider<Integer> i182Provider;
    @Hard
    private final Provider<Integer> i183Provider;
    @Hard
    private final Provider<Integer> i184Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i188Provider;
    @Hard
    private final Provider<Integer> i189Provider;
    @Hard
    private final Provider<Integer> i190Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i193Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i198Provider;
    @Hard
    private final Provider<Integer> i199Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b4Provider.get(request);
		int p3Val = b5Provider.get(request);
		int p4Val = b6Provider.get(request);
		int p5Val = b8Provider.get(request);
		int p6Val = b9Provider.get(request);
		int p7Val = b16Provider.get(request);
		int p8Val = b17Provider.get(request);
		int p9Val = b20Provider.get(request);
		int p10Val = b24Provider.get(request);
		int p11Val = b25Provider.get(request);
		int p12Val = b31Provider.get(request);
		int p13Val = b32Provider.get(request);
		int p14Val = b40Provider.get(request);
		int p15Val = b43Provider.get(request);
		int p16Val = b44Provider.get(request);
		int p17Val = b46Provider.get(request);
		int p18Val = b47Provider.get(request);
		int p19Val = i59Provider.get(request);
		int p20Val = i62Provider.get(request);
		int p21Val = i66Provider.get(request);
		int p22Val = i68Provider.get(request);
		int p23Val = i70Provider.get(request);
		int p24Val = i72Provider.get(request);
		int p25Val = i76Provider.get(request);
		int p26Val = i78Provider.get(request);
		int p27Val = i79Provider.get(request);
		int p28Val = i80Provider.get(request);
		int p29Val = i85Provider.get(request);
		int p30Val = i87Provider.get(request);
		int p31Val = i89Provider.get(request);
		int p32Val = i90Provider.get(request);
		int p33Val = i92Provider.get(request);
		int p34Val = i94Provider.get(request);
		int p35Val = i95Provider.get(request);
		int p36Val = i96Provider.get(request);
		int p37Val = i97Provider.get(request);
		int p38Val = i98Provider.get(request);
		int p39Val = i101Provider.get(request);
		int p40Val = i106Provider.get(request);
		int p41Val = i107Provider.get(request);
		int p42Val = i108Provider.get(request);
		int p43Val = i111Provider.get(request);
		int p44Val = i114Provider.get(request);
		int p45Val = i116Provider.get(request);
		int p46Val = i117Provider.get(request);
		int p47Val = i118Provider.get(request);
		int p48Val = i120Provider.get(request);
		int p49Val = i121Provider.get(request);
		int p50Val = i125Provider.get(request);
		int p51Val = i128Provider.get(request);
		int p52Val = i130Provider.get(request);
		int p53Val = i132Provider.get(request);
		int p54Val = i136Provider.get(request);
		int p55Val = i139Provider.get(request);
		int p56Val = i140Provider.get(request);
		int p57Val = i142Provider.get(request);
		int p58Val = i148Provider.get(request);
		
        try {
            Thread.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p59Val = i150Provider.get(request);
		int p60Val = i151Provider.get(request);
		
        try {
            Thread.sleep(73);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p61Val = i163Provider.get(request);
		int p62Val = i169Provider.get(request);
		int p63Val = i173Provider.get(request);
		
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p64Val = i174Provider.get(request);
		int p65Val = i176Provider.get(request);
		int p66Val = i179Provider.get(request);
		int p67Val = i182Provider.get(request);
		int p68Val = i183Provider.get(request);
		int p69Val = i184Provider.get(request);
		int p70Val = i185Provider.get(request);
		int p71Val = i186Provider.get(request);
		int p72Val = i187Provider.get(request);
		int p73Val = i188Provider.get(request);
		int p74Val = i189Provider.get(request);
		int p75Val = i190Provider.get(request);
		int p76Val = i191Provider.get(request);
		int p77Val = i192Provider.get(request);
		int p78Val = i193Provider.get(request);
		int p79Val = i195Provider.get(request);
		int p80Val = i198Provider.get(request);
		int p81Val = i199Provider.get(request);

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
				p81Val;
    }
}
