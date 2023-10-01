package com.pcl.bigservice.providers;

import com.pcl.annotation.Hard;
import com.pcl.provider.InternalProvider;
import com.pcl.provider.Provider;
import com.pcl.provider.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class I62Provider extends InternalProvider<Integer> {
    @Hard
    private final Provider<Integer> b1Provider;
    @Hard
    private final Provider<Integer> b2Provider;
    @Hard
    private final Provider<Integer> b3Provider;
    @Hard
    private final Provider<Integer> b4Provider;
    @Hard
    private final Provider<Integer> b6Provider;
    @Hard
    private final Provider<Integer> b16Provider;
    @Hard
    private final Provider<Integer> b18Provider;
    @Hard
    private final Provider<Integer> b21Provider;
    @Hard
    private final Provider<Integer> b23Provider;
    @Hard
    private final Provider<Integer> b24Provider;
    @Hard
    private final Provider<Integer> b27Provider;
    @Hard
    private final Provider<Integer> b29Provider;
    @Hard
    private final Provider<Integer> b30Provider;
    @Hard
    private final Provider<Integer> b35Provider;
    @Hard
    private final Provider<Integer> b39Provider;
    @Hard
    private final Provider<Integer> b40Provider;
    @Hard
    private final Provider<Integer> b42Provider;
    @Hard
    private final Provider<Integer> b43Provider;
    @Hard
    private final Provider<Integer> b47Provider;
    @Hard
    private final Provider<Integer> b48Provider;
    @Hard
    private final Provider<Integer> b49Provider;
    @Hard
    private final Provider<Integer> b50Provider;
    @Hard
    private final Provider<Integer> i63Provider;
    @Hard
    private final Provider<Integer> i64Provider;
    @Hard
    private final Provider<Integer> i66Provider;
    @Hard
    private final Provider<Integer> i67Provider;
    @Hard
    private final Provider<Integer> i68Provider;
    @Hard
    private final Provider<Integer> i71Provider;
    @Hard
    private final Provider<Integer> i72Provider;
    @Hard
    private final Provider<Integer> i74Provider;
    @Hard
    private final Provider<Integer> i75Provider;
    @Hard
    private final Provider<Integer> i78Provider;
    @Hard
    private final Provider<Integer> i80Provider;
    @Hard
    private final Provider<Integer> i85Provider;
    @Hard
    private final Provider<Integer> i88Provider;
    @Hard
    private final Provider<Integer> i91Provider;
    @Hard
    private final Provider<Integer> i92Provider;
    @Hard
    private final Provider<Integer> i95Provider;
    @Hard
    private final Provider<Integer> i96Provider;
    @Hard
    private final Provider<Integer> i98Provider;
    @Hard
    private final Provider<Integer> i99Provider;
    @Hard
    private final Provider<Integer> i107Provider;
    @Hard
    private final Provider<Integer> i110Provider;
    @Hard
    private final Provider<Integer> i111Provider;
    @Hard
    private final Provider<Integer> i112Provider;
    @Hard
    private final Provider<Integer> i113Provider;
    @Hard
    private final Provider<Integer> i114Provider;
    @Hard
    private final Provider<Integer> i115Provider;
    @Hard
    private final Provider<Integer> i117Provider;
    @Hard
    private final Provider<Integer> i118Provider;
    @Hard
    private final Provider<Integer> i119Provider;
    @Hard
    private final Provider<Integer> i120Provider;
    @Hard
    private final Provider<Integer> i123Provider;
    @Hard
    private final Provider<Integer> i124Provider;
    @Hard
    private final Provider<Integer> i125Provider;
    @Hard
    private final Provider<Integer> i126Provider;
    @Hard
    private final Provider<Integer> i128Provider;
    @Hard
    private final Provider<Integer> i130Provider;
    @Hard
    private final Provider<Integer> i132Provider;
    @Hard
    private final Provider<Integer> i134Provider;
    @Hard
    private final Provider<Integer> i135Provider;
    @Hard
    private final Provider<Integer> i137Provider;
    @Hard
    private final Provider<Integer> i138Provider;
    @Hard
    private final Provider<Integer> i141Provider;
    @Hard
    private final Provider<Integer> i149Provider;
    @Hard
    private final Provider<Integer> i152Provider;
    @Hard
    private final Provider<Integer> i153Provider;
    @Hard
    private final Provider<Integer> i154Provider;
    @Hard
    private final Provider<Integer> i155Provider;
    @Hard
    private final Provider<Integer> i156Provider;
    @Hard
    private final Provider<Integer> i160Provider;
    @Hard
    private final Provider<Integer> i162Provider;
    @Hard
    private final Provider<Integer> i164Provider;
    @Hard
    private final Provider<Integer> i170Provider;
    @Hard
    private final Provider<Integer> i171Provider;
    @Hard
    private final Provider<Integer> i174Provider;
    @Hard
    private final Provider<Integer> i176Provider;
    @Hard
    private final Provider<Integer> i177Provider;
    @Hard
    private final Provider<Integer> i178Provider;
    @Hard
    private final Provider<Integer> i180Provider;
    @Hard
    private final Provider<Integer> i185Provider;
    @Hard
    private final Provider<Integer> i186Provider;
    @Hard
    private final Provider<Integer> i187Provider;
    @Hard
    private final Provider<Integer> i191Provider;
    @Hard
    private final Provider<Integer> i192Provider;
    @Hard
    private final Provider<Integer> i195Provider;
    @Hard
    private final Provider<Integer> i200Provider;

    @Override
    protected Integer getInternal(Request request) {
        int p1Val = b1Provider.get(request);
		int p2Val = b2Provider.get(request);
		int p3Val = b3Provider.get(request);
		int p4Val = b4Provider.get(request);
		int p5Val = b6Provider.get(request);
		int p6Val = b16Provider.get(request);
		int p7Val = b18Provider.get(request);
		int p8Val = b21Provider.get(request);
		int p9Val = b23Provider.get(request);
		int p10Val = b24Provider.get(request);
		int p11Val = b27Provider.get(request);
		int p12Val = b29Provider.get(request);
		int p13Val = b30Provider.get(request);
		int p14Val = b35Provider.get(request);
		int p15Val = b39Provider.get(request);
		int p16Val = b40Provider.get(request);
		int p17Val = b42Provider.get(request);
		int p18Val = b43Provider.get(request);
		int p19Val = b47Provider.get(request);
		int p20Val = b48Provider.get(request);
		int p21Val = b49Provider.get(request);
		int p22Val = b50Provider.get(request);
		int p23Val = i63Provider.get(request);
		int p24Val = i64Provider.get(request);
		int p25Val = i66Provider.get(request);
		int p26Val = i67Provider.get(request);
		int p27Val = i68Provider.get(request);
		int p28Val = i71Provider.get(request);
		int p29Val = i72Provider.get(request);
		int p30Val = i74Provider.get(request);
		int p31Val = i75Provider.get(request);
		int p32Val = i78Provider.get(request);
		int p33Val = i80Provider.get(request);
		int p34Val = i85Provider.get(request);
		int p35Val = i88Provider.get(request);
		int p36Val = i91Provider.get(request);
		int p37Val = i92Provider.get(request);
		int p38Val = i95Provider.get(request);
		int p39Val = i96Provider.get(request);
		
        try {
            Thread.sleep(46);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p40Val = i98Provider.get(request);
		int p41Val = i99Provider.get(request);
		int p42Val = i107Provider.get(request);
		int p43Val = i110Provider.get(request);
		int p44Val = i111Provider.get(request);
		int p45Val = i112Provider.get(request);
		int p46Val = i113Provider.get(request);
		int p47Val = i114Provider.get(request);
		int p48Val = i115Provider.get(request);
		
        try {
            Thread.sleep(71);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p49Val = i117Provider.get(request);
		int p50Val = i118Provider.get(request);
		int p51Val = i119Provider.get(request);
		int p52Val = i120Provider.get(request);
		int p53Val = i123Provider.get(request);
		int p54Val = i124Provider.get(request);
		int p55Val = i125Provider.get(request);
		int p56Val = i126Provider.get(request);
		int p57Val = i128Provider.get(request);
		int p58Val = i130Provider.get(request);
		int p59Val = i132Provider.get(request);
		int p60Val = i134Provider.get(request);
		int p61Val = i135Provider.get(request);
		int p62Val = i137Provider.get(request);
		int p63Val = i138Provider.get(request);
		int p64Val = i141Provider.get(request);
		int p65Val = i149Provider.get(request);
		int p66Val = i152Provider.get(request);
		int p67Val = i153Provider.get(request);
		int p68Val = i154Provider.get(request);
		int p69Val = i155Provider.get(request);
		int p70Val = i156Provider.get(request);
		int p71Val = i160Provider.get(request);
		int p72Val = i162Provider.get(request);
		int p73Val = i164Provider.get(request);
		int p74Val = i170Provider.get(request);
		int p75Val = i171Provider.get(request);
		int p76Val = i174Provider.get(request);
		int p77Val = i176Provider.get(request);
		int p78Val = i177Provider.get(request);
		int p79Val = i178Provider.get(request);
		int p80Val = i180Provider.get(request);
		int p81Val = i185Provider.get(request);
		int p82Val = i186Provider.get(request);
		int p83Val = i187Provider.get(request);
		int p84Val = i191Provider.get(request);
		int p85Val = i192Provider.get(request);
		
        try {
            Thread.sleep(22);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		int p86Val = i195Provider.get(request);
		int p87Val = i200Provider.get(request);

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
				p82Val +
				p83Val +
				p84Val +
				p85Val +
				p86Val +
				p87Val;
    }
}
